package com.karlson;

/**
 * @author Kristian Karlson
 */
public class Question {

    private String question;
    private String alternativeA;
    private String alternativeB;
    private String alternativeC;
    private String alternativeD;
    private String correctAnswer;

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAlternativeA(String alternativeA) {
        this.alternativeA = alternativeA;
    }

    public void setAlternativeB(String alternativeB) {
        this.alternativeB = alternativeB;
    }

    public void setAlternativeC(String alternativeC) {
        this.alternativeC = alternativeC;
    }

    public void setAlternativeD(String alternativeD) {
        this.alternativeD = alternativeD;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    @Override
    public String toString() {
        return "Question{" +
               "question='" + question + '\'' +
               ", alternativeA='" + alternativeA + '\'' +
               ", alternativeB='" + alternativeB + '\'' +
               ", alternativeC='" + alternativeC + '\'' +
               ", alternativeD='" + alternativeD + '\'' +
               '}';
    }
}
