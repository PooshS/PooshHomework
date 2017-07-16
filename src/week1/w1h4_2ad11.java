package week1;

import java.util.Scanner;

/**
 * Created by Poosh on 25.06.2017.
 */
public class w1h4_2ad11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Укажите ко-во копеек (от 1 до 99): ");
        int cops = sc.nextInt();

        if(cops > 10 & cops < 20){
            System.out.println(cops + " копеек");
        } else {
            if(cops % 10 == 1)System.out.println(cops + " копейка");
            else if(cops % 10 >= 2 & cops % 10 <= 4)System.out.println(cops + " копейки");
            else if(cops % 10 > 4)System.out.println(cops + " копеек");
            else System.out.println(cops + " копеек");
        }
    }
}
