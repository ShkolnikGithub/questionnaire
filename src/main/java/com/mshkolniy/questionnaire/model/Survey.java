package com.mshkolniy.questionnaire.model;

import java.util.List;
import java.util.stream.Collectors;

public class Survey {
    private final List<Question> questions;

    public Survey(final List<Question> questions) {
        this.questions = questions;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    @Override
    public String toString() {
        return questions.stream().map(Object::toString)
                .collect(Collectors.joining(" "));
    }
}
