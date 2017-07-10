package Week1;

import java.util.Scanner;

/**
 * Created by Poosh on 25.06.2017.
 */
public class w1h4_2ad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите три числа: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        boolean rect = a * a == b * b + c * c | b * b == a * a + c * c | c * c == b * b + a * a;

        if(rect){
            System.out.println("Триугольник прямоугольный");
        } else {
            System.out.println("Триугольник не является прямоугольным");
        }
    }
}
