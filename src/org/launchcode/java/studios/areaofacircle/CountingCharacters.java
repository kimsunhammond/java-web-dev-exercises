package org.launchcode.java.studios.areaofacircle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) {
        String theCharacters = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        //char[] charactersInString = myString.toCharArray();
        char[] charactersInString = theCharacters.toCharArray();

        HashMap<Character, Integer> letterCount = new HashMap<>();

        for(char letter : charactersInString) {
            //System.out.println(letter);


            if(letterCount.containsKey(letter)) {
                letterCount.put(letter, letterCount.get(letter) + 1);
            } else {
                letterCount.put(letter, 1);
            }
        }

        for (Map.Entry<Character, Integer> letter : letterCount.entrySet()) {
            System.out.println(letter.getKey() + " : " + letter.getValue());

        }
    }
}
