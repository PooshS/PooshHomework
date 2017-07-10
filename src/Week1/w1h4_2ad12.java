package Week1;

import java.util.Scanner;

/**
 * Created by Poosh on 25.06.2017.
 */
public class w1h4_2ad12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Укажите характер ветра введя номер, где 1 - слабый, 2 - умеренный, 3 - сильный, 4 - ураганный");
        int wind = sc.nextInt();

        switch (wind){
            case 1: System.out.println("Скорость слабого ветра от 1 до 4 м/с");
                break;
            case 2: System.out.println("Скорость умеренного ветра от 5 до 10 м/с");
                break;
            case 3: System.out.println("Скорость сильного ветра от 9 до 18 м/с");
                break;
            case 4: System.out.println("Скорость ураганного ветра больше 19 м/с");
                break;
        }
    }
}
