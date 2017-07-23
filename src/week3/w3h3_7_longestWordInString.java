package week3;

import java.util.Scanner;

/*
 3.7. Найти самое длинное слово в строке(разделенное одним пробелом)
 */

public class w3h3_7_longestWordInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string of some words:");
        String str = sc.nextLine();

        String[] string = str.split(" ");
        String longest = new String("");

        for(int i = 0; i < string.length; i++){
            if(string[i].length() > longest.length()) longest = string[i];
        }
        System.out.println("The longest word in string is: " + longest);
    }
}
