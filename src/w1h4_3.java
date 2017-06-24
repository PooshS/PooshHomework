import java.util.Scanner;

/**
 * Created by Poosh on 24.06.2017.
 */
public class w1h4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число: ");
        int a = sc.nextInt();

        if(a % 7 == 0){
            System.out.println("Удвоенное значение введенного числа = " + a * 2);
        }
    }
}
