import java.util.Scanner;

/**
 * Created by Poosh on 25.06.2017.
 */
public class w1h4_2ad14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите шестизначное число : ");
        int a = sc.nextInt();

        if(a % 10 + (a / 10) % 10 + (a / 100) % 10 == (a / 1000) % 10 + (a / 10000) % 10 + (a / 100000) % 10){
            System.out.println("Число счастливое!");
        } else {
            System.out.println("Сорри!");
        }
    }
}
