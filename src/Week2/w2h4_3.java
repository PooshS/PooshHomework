package Week2;

import Week2.Methods.ArrayUtils;

import java.util.Scanner;

/**
 * Created by Poosh on 08.07.2017.
 */
public class w2h4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arrays size:");
        int size = sc.nextInt();

        int[] arr1 = ArrayUtils.generateArr(size);
        int[] arr2 = ArrayUtils.generateArr(size);

        System.out.print("Generated arr1: ");
        ArrayUtils.printArr(arr1);
        System.out.print("Generated arr2: ");
        ArrayUtils.printArr(arr2);

        for(int i = 0; i < arr2.length; i++){
            arr2[i] = arr1[i];
        }

        System.out.println();
        System.out.print("Changed arr2: ");
        ArrayUtils.printArr(arr2);
    }
}
