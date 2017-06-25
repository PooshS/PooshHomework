import java.util.Scanner;

/**
 * Created by Poosh on 25.06.2017.
 */
public class w1h4_2ad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите три числа: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if(a > 0){
            System.out.println("Первое число в кубе = " + a * a * a);
        } else {
            a = 0;
            System.out.println("Первое число заменено на " + a + ", поскольку оно отрицательное");
        }
        if(b > 0){
            System.out.println("Второе число в кубе = " + b * b * b);
        } else {
            b = 0;
            System.out.println("Второе число заменено на " + b + ", поскольку оно отрицательное");
        }
        if(c > 0){
            System.out.println("Третье число в кубе = " + c * c * c);
        } else {
            c = 0;
            System.out.println("Третье число заменено на " + c + ", поскольку оно отрицательное");
        }
    }
}
