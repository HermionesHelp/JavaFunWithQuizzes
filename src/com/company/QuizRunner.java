package com.company;


import java.util.ArrayList;
import java.util.HashMap;

public class QuizRunner {
    public static void main(String[] args) {
//        Question test1 = new Question("What is your favorite color?", "blue", 1);

//        HashMap<String,String> t2Answers = new HashMap<>();
//        t2Answers.put("A", "blue");
//        t2Answers.put("B", "green");
//        t2Answers.put("C", "red");
//        t2Answers.put("D", "purple");
//        MultipleChoice test2 = new MultipleChoice("What is your favorite color?", "A", 1, t2Answers);

        ArrayList checkAnswers = new ArrayList<>();
        checkAnswers.add("I love ");
        checkAnswers.add("to code.");
        checkAnswers.add("yummy pizza.");
        checkAnswers.add("playing games.");

        ArrayList correctAnswers = new ArrayList<>();
        correctAnswers.add("1");
        correctAnswers.add("2");

        Checkbox test3 = new Checkbox("Choose answer 1 and 2",1, checkAnswers, correctAnswers);

//        System.out.println(test1.askQuestion());
//        System.out.println(test1.gradeQuestion());

//        System.out.println(test2.questionAndOptions());
//        System.out.println(test2.gradeQuestion());

        System.out.println(test3.questionAndOptions());
        System.out.println(test3.gradeQuestion());
    }

}
