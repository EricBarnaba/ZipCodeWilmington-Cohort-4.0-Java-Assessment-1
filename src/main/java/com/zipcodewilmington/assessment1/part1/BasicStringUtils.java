package com.zipcodewilmington.assessment1.part1;
import java.lang.Character;
/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder reverser = new StringBuilder(str);
        reverser.reverse();
        return reverser.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String reversedStr = reverse(str);
        return camelCase(reversedStr);
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        return str.substring(1,str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        StringBuilder inverter = new StringBuilder();
        for (int i = 0; i< str.length(); i++){
            if(Character.isLowerCase(str.charAt(i))){
                inverter.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                inverter.append(Character.toLowerCase(str.charAt(i)));
            }

        }
        return inverter.toString();
    }
}
