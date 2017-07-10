package Week1;

import java.util.Scanner;

/**
 * Created by Poosh on 25.06.2017.
 */
public class w1h4_2ad9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Укажите ваш вес (кг): ");
        double wght = sc.nextDouble();
        System.out.println("Укажите ваш рост (см): ");
        double hgt = sc.nextDouble();

        if(hgt - wght < 100) {
            System.out.println("Вам стоит похудеть на " + ((hgt - wght - 100)*(-1)));
        } else if (hgt - wght > 100){
            System.out.println("Вам стоит прибавить в весе " + (hgt - wght - 100));
        } else {
            System.out.println("Поздравляем, Ваш вес идеален! ");
        }
    }
}
