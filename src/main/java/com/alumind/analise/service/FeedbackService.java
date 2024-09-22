package com.alumind.analise.service;

import com.alumind.analise.exception.FeedbackVazioException;
import com.alumind.analise.model.Feedback;
import com.alumind.analise.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {
    @Autowired
    private FeedbackRepository feedbackRepository;

    public Feedback registrarFeedback(String textoFeedback){
        try {
            if(textoFeedback == null || textoFeedback.trim().isEmpty()){
                throw new FeedbackVazioException();
            }
            Feedback feedback = new Feedback();
            feedback.setFeedback(textoFeedback);
            feedbackRepository.save(feedback);
            System.out.println("Feedback registrado no banco de dados com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Não foi possível registrar o feedback");
        return null;
    }
}
