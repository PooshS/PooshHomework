package week1;

import java.util.Scanner;

/**
 * Created by Poosh on 25.06.2017.
 */
public class w1h4_2ad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите трехзначное число: ");
        int a = sc.nextInt();


        if(a % 10 == (a / 10) % 10 & a % 10 == (a / 100)  % 10){
            System.out.println("Все цифры введенного числа одинаковые");
        } else if(a % 10 == (a / 10) % 10 | a % 10 == (a / 100) % 10 | (a / 10) % 10 == (a / 100) % 10){
            System.out.println("Среди цифр введенного числа есть одинаковые");
        } else {
            System.out.println("Среди цифр введенного числа нет одинаковых");
        }
    }
}
