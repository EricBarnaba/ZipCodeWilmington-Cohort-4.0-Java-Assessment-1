package com.zipcodewilmington.assessment1.part5;

import java.util.Arrays;
import java.util.LinkedList;

public class Palindrome {

    public Integer countPalindromes(String input){
        Integer palindromeCount = 0;
        LinkedList<String> splitIntoSubstrings = substringMaker(input);
        for (String s : splitIntoSubstrings){
            if(isPalindrome(s)){
                palindromeCount++;
            }
        }

        return palindromeCount;
    }

    public static LinkedList<String> substringMaker (String originalString){
        LinkedList<String> substringList = new LinkedList<>();
        for(int i = 0; i<originalString.length();i++){
            for (int j = 1; j<=originalString.length();j++){
                if(j<=i){
                    continue;
                }
                substringList.add(originalString.substring(i,j));
            }

        }
        return substringList;
    }

    public static boolean isPalindrome (String stringToTest){
        StringBuilder reverser = new StringBuilder(stringToTest);
        reverser.reverse();
        return reverser.toString().equals(stringToTest) ? true : false;

    }


}
