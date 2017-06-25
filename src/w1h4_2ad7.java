import java.util.Scanner;

/**
 * Created by Poosh on 25.06.2017.
 */
public class w1h4_2ad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите номер месяца (1 - 12): ");
        int m = sc.nextInt();

         switch (m) {
                case 1:  System.out.println("Январь");
                    break;
                case 2:  System.out.println("Февраль");
                    break;
                case 3:  System.out.println("Март");
                    break;
                case 4:  System.out.println("Апрель");
                    break;
                case 5:  System.out.println("Май");
                    break;
                case 6:  System.out.println("Июнь");
                    break;
                case 7:  System.out.println("Июль");
                    break;
                case 8:  System.out.println("Август");
                    break;
                case 9:  System.out.println("Сентябрь");
                    break;
                case 10: System.out.println("Октябрь");
                    break;
                case 11: System.out.println("Ноябрь");
                    break;
                case 12: System.out.println("Декабрь");
                    break;
                default: System.out.println("Введено некорректные данные!");
                    break;
         }
    }
}
