# 🧪 TESTIFY — Smart Online Test Platform

**TESTIFY** is a web-based testing platform built with **Spring Boot** and **Thymeleaf**, designed to simplify test creation, publishing, and evaluation.  
It allows **admins** to generate tests manually or automatically using the **Gemini AI API**, and **students** to take tests and view their results instantly.

---

## 🏗️ Tech Stack

![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-00758F?style=for-the-badge&logo=mysql&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Gemini API](https://img.shields.io/badge/Gemini_AI_API-4285F4?style=for-the-badge&logo=google&logoColor=white)

| Layer | Technology |
|--------|-------------|
| Backend | **Spring Boot (Java)** |
| Frontend | **Thymeleaf, TailwindCSS** |
| Database | **Postgres |
| AI Integration | **Gemini API (Google Generative AI)** |
| Build Tool | **Maven** |
| Security | **Spring Security (optional login/roles)** |

---

## 🚀 Features

### 👨‍🏫 Admin Panel
- **Create & Publish Tests:** Build tests manually or import questions.
- **AI-Powered Test Generation:** Integrated with **Google Gemini API** to generate test questions automatically.
- **Question Management:** Review, edit, or delete AI-generated questions.
- **Result Overview:** View, manage, and delete student test attempts.

### 👩‍🎓 Student Side
- **Attempt Tests:** Simple and responsive test-taking interface.
- **Instant Results:** Automatically graded with score and correctness summary.

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/<your-username>/testify.git
cd testify
```
### 2️⃣ Configure Database
Edit src/main/resources/application.properties:
```
spring.datasource.url=jdbc:postgresql://localhost:5432/testplatformdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```
### 3️⃣ Add Gemini API Key
Create a .env file or include in application.properties:
```
gemini.api.key=YOUR_GEMINI_API_KEY
```
### 4️⃣ Run the Application
```
mvn spring-boot:run
```
Then open 👉 http://localhost:8080

## 📸 Screenshots 
### 🧾 Test Setting
<img width="1907" height="870" alt="Test setting" src="https://github.com/user-attachments/assets/b8ee8ba8-ca61-4a78-b3c5-cbdda315b1b0" />


### 🧠 AI Question Generation
<img width="1881" height="921" alt="Screenshot 2025-11-02 152805" src="https://github.com/user-attachments/assets/1b5a7122-f3ef-4f20-bf9d-b970945e0c0d" />



### 🧾Manage Question
<img width="1851" height="877" alt="All Question" src="https://github.com/user-attachments/assets/34038c50-6bb6-4276-ad29-f61400ae8d89" />


### 📊View Result
<img width="1891" height="901" alt="Screenshot 2025-11-02 153713" src="https://github.com/user-attachments/assets/52b548f2-b971-436d-a73a-0be3a99a4f16" />

### Demo video
[https://drive.google.com/file/d/1oVSKrpVkN_W6fHRcCzSsT2cYy0bxh5Iu/view?usp=sharing]


## 🤝 Contributing

Pull requests are welcome!
To contribute:

- Fork the repo
- Create your feature branch
- Commit your changes
- Push and submit a PR 🎯

## 👤 Author

**Tilakraj Singh Ranawat**  
📧 [tilakraj.ranawat09@gmail.com](mailto:tilakraj.ranawat09@gmail.com)  
🌐 [LinkedIn](https://www.linkedin.com/in/tilakraj-singh-ranawat-913044287)
