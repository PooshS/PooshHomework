package Week1;

import java.util.Scanner;

/**
 * Created by Poosh on 25.06.2017.
 */
public class w1h4_2ad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите скорость: ");
        double a = sc.nextDouble();
        System.out.println("Введите растояние: ");
        double b = sc.nextDouble();

        System.out.println("Точка назначения будет достигнута через " + (int)(b / a) + " часов и " + (int)(((b / a) - (int)(b / a)) * 60) + " минут");
    }
}
