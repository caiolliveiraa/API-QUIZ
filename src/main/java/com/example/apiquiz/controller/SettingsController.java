package com.example.apiquiz.controller;


import com.example.apiquiz.models.Settings;
import com.example.apiquiz.service.SettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/settings")
public class SettingsController {

    private final SettingsService settingsService;

    @Autowired
    public SettingsController(SettingsService settingsService) {
        this.settingsService = settingsService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Settings> getSettingsById(@PathVariable Long id) {
        Settings settings = settingsService.getSettingsById(id);
        if (settings != null) {
            return ResponseEntity.ok(settings);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Settings> createSettings(@RequestBody Settings settings) {
        Settings createdSettings = settingsService.createSettings(settings);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdSettings);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Settings> updateSettings(@PathVariable Long id, @RequestBody Settings updatedSettings) {
        Settings updated = settingsService.updateSettings(id, updatedSettings);
        if (updated != null) {
            return ResponseEntity.ok(updated);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSettings(@PathVariable Long id) {
        boolean deleted = settingsService.deleteSettings(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

