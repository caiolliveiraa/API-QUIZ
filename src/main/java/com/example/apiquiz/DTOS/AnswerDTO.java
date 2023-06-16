package com.example.apiquiz.DTOS;


public class AnswerDTO {
    private String answer;
    private QuestionDTO question;

    public AnswerDTO() {
    }

    public AnswerDTO(String answer, QuestionDTO question) {
        this.answer = answer;
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public QuestionDTO getQuestion() {
        return question;
    }

    public void setQuestion(QuestionDTO question) {
        this.question = question;
    }
}

