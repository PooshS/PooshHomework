package week1;

import java.util.Scanner;

/**
 * Created by Poosh on 24.06.2017.
 */
public class w1h4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите два числа: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b){
            System.out.println("Разница между первым и вторым числом = " + (a - b));
        } else {
            System.out.println("Сумма первого и второго числа = " + (a + b));
        }
    }
}
