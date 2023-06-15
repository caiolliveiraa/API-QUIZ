package com.example.apiquiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiQuizApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiQuizApplication.class, args);
    }

    public static class Answer {
        private String answer;


        public Answer(String answer) {
            super();
            this.answer = answer;
        }

        public String getAnswer() {
            return answer;
        }

        public void setAnswer(String answer) {
            this.answer = answer;
        }
    }
}
