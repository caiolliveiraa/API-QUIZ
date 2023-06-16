package com.example.apiquiz.service;


import com.example.apiquiz.models.Question;
import com.example.apiquiz.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    @Autowired
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public Question getQuestionById(long id) {
        Optional<Question> questionOptional = questionRepository.findById(id);
        return questionOptional.orElse(null);
    }

    public Question createQuestion(Question question) {
        return questionRepository.save(question);
    }

    public Question updateQuestion(long id, Question updatedQuestion) {
        Optional<Question> questionOptional = questionRepository.findById(id);
        if (questionOptional.isPresent()) {
            Question question = questionOptional.get();
            question.setQuestion(updatedQuestion.getQuestion());
            question.setAnswer(updatedQuestion.getAnswer());
            question.setPoint(updatedQuestion.getPoint());
            question.setCategory(updatedQuestion.getCategory());
            return questionRepository.save(question);
        } else {
            return null;
        }
    }

    public boolean deleteQuestion(long id) {
        Optional<Question> questionOptional = questionRepository.findById(id);
        if (questionOptional.isPresent()) {
            questionRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}

