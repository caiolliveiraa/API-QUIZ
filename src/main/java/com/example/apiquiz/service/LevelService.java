package com.example.apiquiz.service;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class LevelService {

    private final List<String> levels = new ArrayList<>(Arrays.asList("Facil", "Medio", "Dificil"));

    public List<String> getAllLevels() {
        return levels;
    }

    public boolean createLevel(String level) {
        if (!levels.contains(level)) {
            levels.add(level);
            return true;
        }
        return false;
    }

    public boolean deleteLevel(String level) {
        return levels.remove(level);
    }
}

