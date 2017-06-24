import java.util.Scanner;

/**
 * Created by Poosh on 24.06.2017.
 */
public class w1h4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите время от 0 до 24: ");

        byte time = sc.nextByte();

        if (time >= 9 & time <= 18) {
            System.out.println("Я на работе!");
        } else {
            System.out.println("Я отдыхаю!");
        }
    }
}
