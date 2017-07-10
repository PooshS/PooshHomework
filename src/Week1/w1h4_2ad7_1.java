package Week1;

import java.util.Scanner;

/**
 * Created by Poosh on 25.06.2017.
 */
public class w1h4_2ad7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите номер месяца (1 - 12): ");
        double m = sc.nextDouble();

        if(m >= 1 & m <= 12 & m % 1 == 0) {
            if (m == 1) System.out.println("Январь");
            if (m == 2) System.out.println("Февраль");
            if (m == 3) System.out.println("Март");
            if (m == 4) System.out.println("Апрель");
            if (m == 5) System.out.println("Май");
            if (m == 6) System.out.println("Июнь");
            if (m == 7) System.out.println("Июль");
            if (m == 8) System.out.println("Август");
            if (m == 9) System.out.println("Сентябрь");
            if (m == 10) System.out.println("Октябрь");
            if (m == 11) System.out.println("Ноябрь");
            if (m == 12) System.out.println("Декабрь");
        } else {
            System.out.println("Введено некорректные данные!");
        }
    }
}
