import java.util.Scanner;

/**
 * Created by Poosh on 25.06.2017.
 */
public class w1h4_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите два числа: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean bool = a % 10 == b % 10;

        System.out.println(bool);
    }
}
