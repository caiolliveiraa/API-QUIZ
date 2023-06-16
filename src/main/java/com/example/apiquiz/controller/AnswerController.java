package com.example.apiquiz.controller;


import com.example.apiquiz.models.Answer;
import com.example.apiquiz.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/answers")
public class AnswerController {

    private final AnswerService answerService;

    @Autowired
    public AnswerController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Answer> getAnswerById(@PathVariable Long id) {
        Answer answer = answerService.getAnswerById(id);
        if (answer != null) {
            return ResponseEntity.ok(answer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Answer> createAnswer(@RequestBody Answer answer) {
        Answer createdAnswer = answerService.createAnswer(answer);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdAnswer);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Answer> updateAnswer(@PathVariable Long id, @RequestBody Answer updatedAnswer) {
        Answer answer = answerService.getAnswerById(id);
        if (answer != null) {
            Answer updated = answerService.updateAnswer(answer, updatedAnswer);
            return ResponseEntity.ok(updated);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAnswer(@PathVariable Long id) {
        boolean deleted = answerService.deleteAnswerById(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

