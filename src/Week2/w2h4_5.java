package Week2;

import Week2.Methods.ArrayUtils;

import java.util.Scanner;

/**
 * Created by Poosh on 08.07.2017.
 */
public class w2h4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();

        int[] arr = ArrayUtils.generateRegularArr(size);
        ArrayUtils.printArr(arr);
    }
}
