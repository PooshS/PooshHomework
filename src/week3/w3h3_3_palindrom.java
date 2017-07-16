package week3;

/*
 3.3. Написать метод, который проверяет является ли строка палиндромом
 */

import java.util.Scanner;

public class w3h3_3_palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word:");
        String str = sc.next();

        boolean isPalindrom = true;

        String rev = "";
        //int lnght = str.length();
        char[] charInArr = new char[str.length()];
        for(int i = 0; i < charInArr.length; i++){
            rev = rev + str.substring((charInArr.length - (i + 1)), (charInArr.length - i));
        }
        System.out.println(rev);

        for(int i = 0; i < charInArr.length; i++){
            if(!str.equals(rev)){
            //if(!str.substring(i, i + 1).equals(rev.substring(i, i + 1))){
            //if(str.codePointAt(i) != rev.codePointAt(i)){
                isPalindrom = false;
                break;
            }
        }

        if(isPalindrom) {
            System.out.println("The word is palindrome");
        } else System.out.println("The word is not palindrome");

    }

}
