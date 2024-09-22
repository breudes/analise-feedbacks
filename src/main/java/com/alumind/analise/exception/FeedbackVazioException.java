package com.alumind.analise.exception;

public class FeedbackVazioException extends IllegalArgumentException {
    public FeedbackVazioException() {
        super("O texto do feedback não pode ser nulo ou vazio.");
    }
}
