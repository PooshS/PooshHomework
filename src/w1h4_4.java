import java.util.Scanner;

/**
 * Created by Poosh on 24.06.2017.
 */
public class w1h4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число от 0 до 1 (не включая границы): ");
        double a = sc.nextDouble();

        if(a >= 1 | a <= 0){
            System.out.println("Вы ввели некорректное число.");
        } else {
            System.out.println("Спасибо!");
        }
    }
}
