import java.util.Scanner;

/**
 * Created by Poosh on 25.06.2017.
 */
public class w1h4_2ad13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число A: ");
        double A = sc.nextDouble();
        System.out.println("Введите число B: ");
        double B = sc.nextDouble();
        System.out.println("Введите число C: ");
        double C = sc.nextDouble();

        if(A + B + C > 0){
            A = A * 2;
            System.out.println("A = " + A);
            B = B * 2;
            System.out.println("B = " + B);
            C = C * 2;
            System.out.println("C = " + C);
        } else {
            A = B = C = 0;
            System.out.println("A = " + A);
            System.out.println("B = " + B);
            System.out.println("C = " + C);
        }
    }
}
