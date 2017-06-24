import java.util.Scanner;

/**
 * Created by Poosh on 24.06.2017.
 */
public class w1h4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите три числа: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max;
        int min;

        if(a > b & a > c){
            max = a;
            if(b < c){
                min = b;
            } else {
                min = c;
            }

        } else if(b > a & b > c){
            max = b;
            if(a < c){
                min = a;
            } else {
                min = c;
            }
        } else{
            max = c;
            if(a < b){
                min = a;
            } else {
                min = b;
            }
        }

        System.out.println("Наибольшее число среди введенных - " + max);
        System.out.println("Наименьшее число среди введенных - " + min);
    }
}
