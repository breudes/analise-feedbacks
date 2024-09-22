package com.alumind.analise.controller;

import com.alumind.analise.model.Feedback;
import com.alumind.analise.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/feedbacks")
public class FeedbackController {
    @Autowired
    private FeedbackService feedbackService;

    @PostMapping
    public ResponseEntity<String> receberFeedback(@RequestBody String feedback) {
        feedbackService.registrarFeedback(feedback);
        return ResponseEntity.ok("Feedback recebido com sucesso!");
    }
}
