package com.karlson.questions;

public class Question {

    // Requred parameters
    private String quiz;
    private String optionA;
    private String optionB;
    private String answer;
    private String optionC;
    private String optionD;

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

    public String getOptionA() {
        return optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public String getAnswer() {
        return answer;
    }

    public String getOptionC() {
        return optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    @Override
    public String toString() {
        return "Question{" +
                "quiz='" + quiz + '\'' +
                ", answer='" + answer + '\'' +
                ", optionA='" + optionA + '\'' +
                ", optionB='" + optionB + '\'' +
                ", optionC='" + optionC + '\'' +
                ", optionD='" + optionD + '\'' +
                '}';
    }

    public static class QuestionBuilder {

        // Requred parameters
        private String quiz;
        private String optionA;
        private String optionB;
        private String answer;
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
            this.answer = answer;
            return this;
        }

        public Question build() {
            return new Question(this);
        }
    }
}
