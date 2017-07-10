package Week1;

import java.util.Scanner;

/**
 * Created by Poosh on 25.06.2017.
 */
public class w1h4_2ad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Укажите тариф переговоров (грн./час): ");
        double rate = sc.nextDouble();
        System.out.println("Укажите день переговоров по его номеру (1 - 7): ");
        int day = sc.nextInt();
        System.out.println("Введите продолжительность переговоров: ");
        double duration = sc.nextDouble();


        if(day == 6 | day == 7) {
            System.out.println("Стоимость переговоров составляет " + (duration * rate * 0.8));
        } else {
            System.out.println("Стоимость переговоров составляет " + (duration * rate ));
        }
    }
}
