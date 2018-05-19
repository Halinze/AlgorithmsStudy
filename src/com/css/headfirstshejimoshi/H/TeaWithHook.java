package com.css.headfirstshejimoshi.H;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 46597 on 2018/5/14.
 */
public class TeaWithHook extends CaffeineBeverage {


    @Override
    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    //钩子
    protected boolean customerWantersCondiments() {

        String answer = getUserInput();


        if(answer.toLowerCase().startsWith("y")){
            return true;
        }else{
            return false ;
        }

    }


    public String getUserInput() {
        String answer = null ;

        System.out.println("Would you like mike and sugar with your coffee (y/n) ?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try{
            answer = in.readLine();
        }catch (IOException ioe){
            System.out.println("IO error trying to read your answer");
        }

        if(answer == null){
            return "no";
        }
        return answer;
    }
}
