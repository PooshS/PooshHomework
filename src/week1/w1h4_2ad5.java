package week1;

import java.util.Scanner;

/**
 * Created by Poosh on 25.06.2017.
 */
public class w1h4_2ad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число а: ");
        double a = sc.nextDouble();
        System.out.println("Введите число b: ");
        double b = sc.nextDouble();
        System.out.println("Введите число c: ");
        double c = sc.nextDouble();

        if(a == b & b == c){
            System.out.println("Все три числа равные");
        } else if(a == b | a == c | b == c) {
            System.out.println("Имеется одна пара равных чисел");
        } else {
            System.out.println("Все числа разные");
        }
    }
}
