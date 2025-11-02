package com.test.testplatform.controller;

import com.test.testplatform.model.Question;
import com.test.testplatform.service.GeminiService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gemini")
public class GeminiController {

    @Autowired
    private GeminiService service;

    @PostMapping("/format-and-save")
    public ResponseEntity<?> formatAndSaveQuestions(@RequestBody String rawQuestions) {
        List<Question> savedQuestions = service.processAndSaveQuestions(rawQuestions);
        //String savedQuestions = service.generateContent(rawQuestions);
        System.out.println(savedQuestions);
        if (savedQuestions.isEmpty()) {
            return ResponseEntity.badRequest().body("Failed to process or save questions. Please check the input format.");
        }

        return ResponseEntity.ok(savedQuestions);  // Return saved question list
    }
}
