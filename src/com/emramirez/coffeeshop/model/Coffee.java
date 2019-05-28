package com.emramirez.coffeeshop.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {

    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")){
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like mild and sugar with your coffee (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ex) {
            System.err.println("IO Error trying to read your answer");
        }
        if(answer == null) {
            return "no";
        }
        return answer;
    }
}
