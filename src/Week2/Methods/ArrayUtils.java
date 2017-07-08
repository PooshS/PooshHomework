package Week2.Methods;

import java.util.Scanner;

/**
 * Created by Poosh on 08.07.2017.
 */
public class ArrayUtils {

    public static int[] generateArr(int size){
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();*/

        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }

    public static int[] generateRegularArr(int size){
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            int el = (int)(Math.random()*100);
            if(i%2 == 0){
                if(el % 2 == 0){
                    arr[i] = el;
                } else arr[i] = el + 1;
            } else {
                if(el % 2 != 0){
                    arr[i] = el;
                } else arr[i] = el + 1;
            }
        }
        return arr;
    }

    public static void printArr(int[] arr){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
