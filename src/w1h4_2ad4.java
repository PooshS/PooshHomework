import java.util.Scanner;

/**
 * Created by Poosh on 25.06.2017.
 */
public class w1h4_2ad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите скорость в км/ч: ");
        double kmh = sc.nextDouble();
        System.out.println("Введите скорость в м/с: ");
        double ms = sc.nextDouble();

        if(kmh * 1000 / 3600 > ms){
            System.out.println("Скорость в км/ч больше скорости в м/с");
        } else if(kmh * 1000 / 3600 < ms) {
            System.out.println("Скорость в м/с больше скорости в км/ч");
        } else {
            System.out.println("Скорость в м/с = скорости в км/ч");
        }
    }
}
