package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String args[]){
        String text = "2+3*4";
        /*Pattern patternDigits = Pattern.compile("(\\d)");
        Matcher matcherDigits = patternDigits.matcher(text);
        while(matcherDigits.find()){
            System.out.println(matcherDigits.group(1));
          //  System.out.println(matcher.group(2));
        }*/
        String[] strArray = text.split("\\D");
        String[] operationArray = text.split("\\d|\\s");
        for(String str : strArray){

        }


    }

}
