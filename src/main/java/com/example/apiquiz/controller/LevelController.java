package com.example.apiquiz.controller;


import com.example.apiquiz.service.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/levels")
public class LevelController {

    private final LevelService levelService;

    @Autowired
    public LevelController(LevelService levelService) {
        this.levelService = levelService;
    }

    @GetMapping
    public ResponseEntity<List<String>> getAllLevels() {
        List<String> levels = levelService.getAllLevels();
        return ResponseEntity.ok(levels);
    }

    @PostMapping
    public ResponseEntity<String> createLevel(@RequestBody String level) {
        boolean created = levelService.createLevel(level);
        if (created) {
            return ResponseEntity.status(HttpStatus.CREATED).body(level);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping("/{level}")
    public ResponseEntity<Void> deleteLevel(@PathVariable String level) {
        boolean deleted = levelService.deleteLevel(level);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

