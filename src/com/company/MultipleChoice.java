package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MultipleChoice extends Question {

    private HashMap<String, String> answerOptions;
    private String correctAnswer;

    public MultipleChoice(String question, Integer pointValue, HashMap<String, String> answerOptions, String correctAnswer ) {
        super(question, pointValue);
        this.answerOptions = answerOptions;
        this.correctAnswer = correctAnswer;
    }

    // getUserAnswer used to be in the Question class. Which makes sense, until we get into the Checkbox and need to return an arrayList
    // with our users answers. There is a way to handle this better with interfaces, but the easiest solution is to move this code to each class
    // if we're not using an interface
    public String getUserAnswer(){
        Scanner input = new Scanner(System.in);
        System.out.println("Your Answer: ");
        String userAnswer = input.next();
        return userAnswer;
    }

    public String questionAndOptions (){
        // this is something you won't have to know about for this class, but it's another way to handle a situation like this
        // where we need to build a string with a for loop.
        StringBuilder str = new StringBuilder();
        str.append(this.askQuestion());

        // this is another way to handle a loop on a HashMap. It's a built-in foreach method, and you can use big arrow syntax to
        // define the "function" that will be executed in each loop of the HashMap
        // We really only saw big arrow syntax in Unit 1 when we were working with Angular, but basically you're taking those () before
        // the -> to define what your parameters are going to be for this "function". Because it's iterating across an already declared
        // HashMap we don't have to explicitly include the types inside of these ().
        // The -> (which was a => in JavaScript) points to the {} which contain the code to be executed for each item in the HashMap.
        // and because of the big arrow syntax this whole "function" is contained within the () of the .forEach()
        this.answerOptions.forEach((k,v) -> {
            str.append("\n" + k + ": " + v + " ");
        });

        // Because str is the StringBuilder object, to get the string that we've built back out of it we have to call the toString on that
        // StringBuilder object.
        return str.toString();
    }

    public String gradeQuestion(){
        String userAnswer = this.getUserAnswer();
        if (userAnswer.equals(correctAnswer)){
            this.setCorrect(true);
            return "You are correct.";
        }else {
            this.setCorrect(false);
            return "Your answer " + userAnswer + " was incorrect. The correct answer was " + this.correctAnswer + ".";
        }
    }
}
