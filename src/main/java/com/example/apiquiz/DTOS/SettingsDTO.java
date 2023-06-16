package com.example.apiquiz.DTOS;


public class SettingsDTO {
    private LevelDTO level;
    private CategoryDTO category;

    public SettingsDTO() {
    }

    public SettingsDTO(LevelDTO level, CategoryDTO category) {
        this.level = level;
        this.category = category;
    }

    public LevelDTO getLevel() {
        return level;
    }

    public void setLevel(LevelDTO level) {
        this.level = level;
    }

    public CategoryDTO getCategory() {
        return category;
    }

    public void setCategory(CategoryDTO category) {
        this.category = category;
    }
}

