package com.evan.pattern.template.method.hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by wangzhen318 on 2017/4/14.
 */
public class TeaWithHook extends CaffeineBeverageWithHook {

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        }
        return false;
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("would you like lemon with your coffee (y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.out.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }

    @Override
    public void addCondiments() {
        System.out.println("adding lemon");
    }

    @Override
    public void brew() {
        System.out.println("steeping the tea");
    }
}
