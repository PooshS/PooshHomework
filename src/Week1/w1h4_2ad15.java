package Week1;

import java.util.Scanner;

/**
 * Created by Poosh on 25.06.2017.
 */
public class w1h4_2ad15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите площадь квадрата : ");
        double Ss = sc.nextDouble();
        System.out.println("Введите площадь круга : ");
        double Sc = sc.nextDouble();

        if(Ss >= 4 * Sc / 3.14){
            System.out.println("Круг уместится в квадрат!");
        } else if(Ss <= 2 * Sc/3.14) {
            System.out.println("Квадрат уместится в круг!");
        } else {
            System.out.println("Фигуры не помещаются одна в другую");
        }
    }
}
