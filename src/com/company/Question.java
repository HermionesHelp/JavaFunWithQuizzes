package com.company;

import java.util.Collection;
import java.util.Scanner;

public abstract class Question {

    private String question;

    private Integer pointValue;
    private Boolean correct;

    public Question (String question, Integer pointValue){
        this.question = question;
        this.pointValue = pointValue;
    }

    // ask question
    public String askQuestion (){
        return this.question;
    }

    // While working through the child classes I realized that some of these types are going to need to have a different grading method
    // which made it make more sense to create this as an abstract method. Even though Multiple Choice and True or False questions can have
    // the same type of grading, the checkbox can't
    // This is where Interfaces would be good, but we'll touch on those soon.
    public abstract String gradeQuestion();

    public Boolean getCorrect() {
        return correct;
    }

    public void setCorrect(Boolean correct) {
        this.correct = correct;
    }

    public Integer getPointValue() {
        return pointValue;
    }
}
