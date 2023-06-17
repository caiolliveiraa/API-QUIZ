package com.example.apiquiz.service;


import com.example.apiquiz.models.Answer;
import com.example.apiquiz.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnswerService {

    private final AnswerRepository answerRepository;

    @Autowired
    public AnswerService(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    public Answer getAnswerById(Long id) {
        Optional<Answer> answerOptional = answerRepository.findById(id);
        return answerOptional.orElse(null);
    }

    public Answer createAnswer(Answer answer) {
        return answerRepository.save(answer);
    }

    public Answer updateAnswer(Answer existingAnswer, Answer updatedAnswer) {
        return answerRepository.save(existingAnswer);
    }

    public boolean deleteAnswerById(Long id) {
        if (answerRepository.existsById(id)) {
            answerRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public List<Answer> getAllAnswers() {
        return answerRepository.findAll();
    }
}

