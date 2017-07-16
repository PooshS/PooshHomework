package week2;

import week2.Methods.ArrayUtils;

import java.util.Scanner;

/**
 * Created by Poosh on 08.07.2017.
 */
public class w2h4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size (only even number & > 0):");
        int size = sc.nextInt();
        if(size % 2 != 0){
            System.out.println("You have entered incorrect number (odd)!");
            System.out.println("Size will be increased for 1");
            size = size + 1;
        } else if(size == 0){
            System.out.println("You have entered incorrect number (it shouldn't be 0)!");
            System.out.println("Size will be increased for 2");
            size = size + 2;
        }

        int[] arr = ArrayUtils.generateArr(size);
        System.out.print("Generated arr: ");
        ArrayUtils.printArr(arr);
        System.out.println();

        double sum1 = 0;
        double sum2 = 0;
        for(int i = 0; i < arr.length; i++){
            if(i < arr.length/2){
                sum1 = sum1 + arr[i];
            } else sum2 = sum2 + arr[i];
        }

        double avg1 = sum1/(arr.length/2);
        double avg2 = sum2/(arr.length/2);

        if(avg1 > avg2){
            System.out.print("The first part of array ( ");
            for(int i = 0; i < arr.length/2; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println(") has bigger average then second: " + avg1 + " against " + avg2);
        } else {
            System.out.print("The second part of array ( ");
            for(int i = arr.length/2; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println(") has bigger average then first: " + avg2 + " against " + avg1);
        }
    }
}
