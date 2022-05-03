package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Checkbox extends Question {

    private ArrayList<String> answerOptions;
    private ArrayList<String> correctAnswer;

    public Checkbox(String question, Integer pointValue, ArrayList<String> answerOptions, ArrayList<String> correctAnswer) {
        super(question,  pointValue);
        this.answerOptions = answerOptions;
        this.correctAnswer = correctAnswer;
    }

    public ArrayList<String> getUserAnswer(){
        Scanner input = new Scanner(System.in);
        System.out.println("Your Answer: ");
        ArrayList<String> userAnswer = new ArrayList<>();

        for (int i = 0; i < this.correctAnswer.size(); i++){
            userAnswer.add(input.next());
        }

        return userAnswer;
    }

    public String questionAndOptions(){
        // this is something you won't have to know about for this class, but it's another way to handle a situation like this
        // where we need to build a string with a for loop.
        StringBuilder str = new StringBuilder();
        str.append(this.askQuestion());

        for (int i = 0; i < this.answerOptions.size(); i++) {
            // If you missed the template literals from JavaScript, Java does have the String.format() which is similar.
            // You can use an %s to represent a String value, %d for an integer, %f for a float...
            // https://www.javatpoint.com/java-string-format
            str.append(String.format("\n %d: %s", i+1, this.answerOptions.get(i)));
        }
        return str.toString();
    }


    public String gradeQuestion() {
        ArrayList<String> userAnswers = this.getUserAnswer();
        int answersCorrect = 0;
        for (int i = 0; i < userAnswers.size(); i++) {
            if (this.correctAnswer.contains(userAnswers.get(i))) {
                answersCorrect++;
            }
        }

        return "You got "+ answersCorrect + " answers correct.";
    }
}

