package Week1;

import java.util.Scanner;

/**
 * Created by Poosh on 24.06.2017.
 */
public class w1h4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите два числа: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean bool = a % b == 0;

        if(bool){
            System.out.println(bool);
            System.out.println("Результат деления: целая часть = " + (a / b) + ", остача = " + (a % b));
        } else {
            System.out.println(bool);
            System.out.println("Результат деления: целая часть = " + (a / b) + ", остача = " + (a % b));
        }
    }
}
