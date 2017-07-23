package week3;

import java.util.Scanner;

/*
 3.8. Верхний регистр.

 Напишите программу, которая позволяет пользователю ввести в консоли строку,
 переводит первый символ слов в верхний регистр и результат выводит в консоль
 */

public class w3h3_8_firstLetterUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string of some words:");
        String str = sc.nextLine();
        String[] string = str.split(" ");

        for(int i = 0; i < string.length; i++){
            String f = string[i].substring(0, 1);
            f = f.toUpperCase();
            String end = string[i].substring(1);
            string[i] = f.concat(end);
            System.out.print(string[i] + " ");
        }
    }
}
