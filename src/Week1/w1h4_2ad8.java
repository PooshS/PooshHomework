package Week1;

import java.util.Scanner;

/**
 * Created by Poosh on 25.06.2017.
 */
public class w1h4_2ad8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Сумма покупки: ");
        double sum = sc.nextDouble();

        if(sum > 1000) {
            System.out.println("Стоимость покупки - " + (sum * 0.9));
        } else {
            System.out.println("Стоимость покупки - " + sum);
        }
    }
}
