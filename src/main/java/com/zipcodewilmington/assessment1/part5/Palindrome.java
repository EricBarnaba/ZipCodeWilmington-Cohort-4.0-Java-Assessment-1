package com.zipcodewilmington.assessment1.part5;

import java.util.Arrays;

public class Palindrome {

    public Integer countPalindromes(String input){
        Integer palindromeCount = 0;
        String[] splitIntoSubstrings = substringMaker(input);
        for (String s : splitIntoSubstrings){
            if(isPalindrome(s)){
                palindromeCount++;
            }
        }

        return palindromeCount;
    }

    public static String[] substringMaker (String originalString){
        String[] substringArray = new String[0];
        for(int i = 0; i<originalString.length();i++){
            for (int j = 1; j<=originalString.length();j++){
                if(j<=i){
                    continue;
                }
                substringArray = Arrays.copyOf(substringArray, substringArray.length+1);
                substringArray[substringArray.length-1] = originalString.substring(i,j);
            }

        }
        return substringArray;
    }

    public static boolean isPalindrome (String stringToTest){
        StringBuilder reverser = new StringBuilder(stringToTest);
        reverser.reverse();
        return reverser.toString().equals(stringToTest) ? true : false;

    }


}
