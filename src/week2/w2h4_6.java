package week2;

import week2.Methods.ArrayUtils;

import java.util.Scanner;

/**
 * Created by Poosh on 08.07.2017.
 */
public class w2h4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();

        int[] arr = ArrayUtils.generateArr(size);

        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        ArrayUtils.printArr(arr);
        System.out.println("Average of array elements = " + sum/(arr.length != 0 ? arr.length: 1));
    }
}
