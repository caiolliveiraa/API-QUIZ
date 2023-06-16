package com.example.apiquiz.DTOS;

import java.util.List;

public class CategoryDTO {
    private String category;
    private List<QuestionDTO> questions;


    public CategoryDTO() {
    }

    public CategoryDTO(String category, List<QuestionDTO> questions) {
        this.category = category;
        this.questions = questions;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<QuestionDTO> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionDTO> questions) {
        this.questions = questions;
    }
}

