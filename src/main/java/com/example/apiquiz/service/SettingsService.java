package com.example.apiquiz.service;


import com.example.apiquiz.models.Settings;
import com.example.apiquiz.repository.SettingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SettingsService {

    private final SettingsRepository settingsRepository;

    @Autowired
    public SettingsService(SettingsRepository settingsRepository) {
        this.settingsRepository = settingsRepository;
    }

    public Settings getSettingsById(Long id) {
        Optional<Settings> settingsOptional = settingsRepository.findById(id);
        return settingsOptional.orElse(null);
    }

    public Settings createSettings(Settings settings) {
        return settingsRepository.save(settings);
    }

    public Settings updateSettings(Long id, Settings updatedSettings) {
        Optional<Settings> settingsOptional = settingsRepository.findById(id);
        if (settingsOptional.isPresent()) {
            Settings settings = settingsOptional.get();
            return settingsRepository.save(settings);
        } else {
            return null;
        }
    }

    public boolean deleteSettings(Long id) {
        Optional<Settings> settingsOptional = settingsRepository.findById(id);
        if (settingsOptional.isPresent()) {
            settingsRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}

