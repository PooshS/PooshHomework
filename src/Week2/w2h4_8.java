package Week2;

import Week2.Methods.ArrayUtils;

import java.util.Scanner;

/**
 * Created by Poosh on 08.07.2017.
 */
public class w2h4_8 {
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

        int[] arr3 = new int[size];
        for(int i = 0; i < arr3.length; i++){
            arr3[i] = arr1[i] + arr2[i];
        }

        System.out.println();
        System.out.print("Created arr3: ");
        ArrayUtils.printArr(arr3);
    }
}
