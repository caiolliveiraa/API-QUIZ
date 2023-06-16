package com.example.apiquiz.DTOS;


public class QuestionDTO {
    private long id;
    private String question;
    private AnswerDTO answer;
    private int point;
    private CategoryDTO category;


    public QuestionDTO() {
    }

    public QuestionDTO(long id, String question, AnswerDTO answer, int point, CategoryDTO category) {
        this.id = id;
        this.question = question;
        this.answer = answer;
        this.point = point;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public AnswerDTO getAnswer() {
        return answer;
    }

    public void setAnswer(AnswerDTO answer) {
        this.answer = answer;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public CategoryDTO getCategory() {
        return category;
    }

    public void setCategory(CategoryDTO category) {
        this.category = category;
    }
}

