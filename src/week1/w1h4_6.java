package week1;

import java.util.Scanner;

/**
 * Created by Poosh on 24.06.2017.
 */
public class w1h4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите два числа: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean sum = (a + b)> 11 & (a + b) < 19;

        if(sum){
            System.out.println("Сумма введенных чисел = " + (a + b));
        } else {
            System.out.println("The End!");
        }
    }
}
