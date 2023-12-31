package com.karlson.questions;

public class Question {

    // Required parameters
    private final String quiz;
    private final String optionA;
    private final String optionB;
    private final int answer;
    private final String optionC;
    private final String optionD;
    private boolean correctAnswer = false;

    public Question(QuestionBuilder builder) {
        this.quiz = builder.quiz;
        this.answer = builder.answer;
        this.optionA = builder.optionA;
        this.optionB = builder.optionB;
        this.optionC = builder.optionC;
        this.optionD = builder.optionD;
    }

    public String getQuiz() {
        return quiz;
    }

    public void setCorrectAnswer(boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public boolean wasCorrectAnswer(){
        return correctAnswer;
    }

    public int getAnswer() {
        return answer;
    }

    public String prompt() {
        // method won't add Option C + D if they are empty

        String formattedQuestion = quiz + "\n1: " + optionA + "\n2: " + optionB;
        if (optionC != null) {
            formattedQuestion = formattedQuestion.concat("\n3: " + optionC);
        }
        if (optionD != null) {
            formattedQuestion = formattedQuestion.concat("\n4: " + optionD);
        }
        return formattedQuestion;
    }

    public static class QuestionBuilder {

        // Required parameters
        private String quiz;
        private String optionA;
        private String optionB;
        private int answer;
        //  Optional parameters
        private String optionC;
        private String optionD;


        public QuestionBuilder setQuiz(String quiz) {
            this.quiz = quiz;
            return this;
        }

        public QuestionBuilder setOptionA(String optionA) {
            this.optionA = optionA;
            return this;
        }

        public QuestionBuilder setOptionB(String optionB) {
            this.optionB = optionB;
            return this;
        }

        public QuestionBuilder setOptionC(String optionC) {
            this.optionC = optionC;
            return this;
        }

        public QuestionBuilder setOptionD(String optionD) {
            this.optionD = optionD;
            return this;
        }

        public QuestionBuilder setAnswer(String answer) {
            this.answer = Integer.parseInt(answer);
            return this;
        }

        public Question build() {
            return new Question(this);
        }
    }
}
