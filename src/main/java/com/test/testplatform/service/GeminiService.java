package com.test.testplatform.service;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.testplatform.client.GeminiClient;
import com.test.testplatform.dto.GeminiRequest;
import com.test.testplatform.dto.GeminiResponse;
import com.test.testplatform.model.Question;
import com.test.testplatform.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GeminiService {

    @Autowired
    private GeminiClient geminiClient;

    @Value("${gemini.api.key}")
    private String key;

    @Autowired
    private QuestionRepository questionRepo;

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public String generateContent(String question){

        GeminiRequest.Part part = new GeminiRequest.Part(question);
        GeminiRequest.Content content = new GeminiRequest.Content(List.of(part));
        GeminiRequest request = new GeminiRequest(List.of(content));
        GeminiResponse response = geminiClient.generateContent(request,key);
        return  response.getCandidates().get(0).getContent()
                .getParts()
                .get(0)
                .getText();
    }

    private String cleanJson(String raw) {
        // Remove ```json and ``` or any surrounding backticks
        return raw.replaceAll("(?s)```json\\s*|```", "").trim();
    }


    public List<Question> processAndSaveQuestions(String rawText) {
        String prompt = "You are an AI expert in MCQ formatting. Convert the following messy raw text into a JSON array where each item has the fields: " +
                "text, optionA, optionB, optionC, optionD, and correctAnswer (e.g., 'A', 'B', etc). Don't include explanations. Here is the input:\n\n" +
                rawText;

        String json = generateContent(prompt);
        //System.out.println("Raw AI Response:\n" + json);

        String cleanedJson = cleanJson(json); // ← Clean response

        try {
            ObjectMapper mapper = new ObjectMapper();
            List<Question> questions = mapper.readValue(cleanedJson, new TypeReference<>() {});
            return questionRepo.saveAll(questions);
        } catch (Exception e) {
            e.printStackTrace();
            return List.of();
        }
    }

}
