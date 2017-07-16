package week2;

import week2.Methods.ArrayUtils;

import java.util.Scanner;

/**
 * Created by Poosh on 08.07.2017.
 */
public class w2h4_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();
        int range = 75;

        int[] arr1 = ArrayUtils.generateArrWithRange(size, range);
        System.out.print("Generated Array1: ");
        ArrayUtils.printArr(arr1);

        int[] arr2 = ArrayUtils.generateArrWithRange(size, range);
        System.out.print("Generated Array2: ");
        ArrayUtils.printArr(arr2);
        System.out.println();

        int evenArr1 = 0;
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] % 2 ==0) evenArr1++;
        }

        int evenArr2 = 0;
        for(int i = 0; i < arr2.length; i++){
            if(arr2[i] % 2 ==0) evenArr2++;
        }

        if(evenArr1 > evenArr2){
            System.out.println("Array1 has more even elements than Array2: " + evenArr1 + " against " + evenArr2);
        } else if(evenArr1 < evenArr2){
            System.out.println("Array2 has more even elements than Array1: " + evenArr2 + " against " + evenArr1);
        } else {
            System.out.println("Array1 & Array2 has equal even elements: " + evenArr1 + " and " + evenArr2);
        }
    }
}
