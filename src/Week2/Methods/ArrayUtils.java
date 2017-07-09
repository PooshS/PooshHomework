package Week2.Methods;

import java.util.Scanner;

/**
 * Created by Poosh on 08.07.2017.
 */
public class ArrayUtils {


    // method for array generate by random
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


    // method for array generate by random. All elements a regular
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


    //method for array generate by random (with tange)
    public static int[] generateArrWithRange(int size, int range) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            int el = (int)(Math.random() * range);
            if(el >= 25) {
                arr[i] = el;
            } else arr[i] = el + 25;
        }
        return arr;
    }


    // method of cutting array to given ranges
    public static int[] splitArray(int[] arr, int start, int end){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= start && arr[i] <= end) count++;
        }

        int [] arrNew = new int[count];
        if(count ==0){
            System.out.println("There are no values in the given range!");
            return arrNew;
        }
        int j = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= start && arr[i] <= end){
                arrNew[j] = arr[i];
                j++;
            }
        }
        System.out.println("The result of an array in a given range: ");
        return arrNew;
    }


    //method of array printing
    public static void printArr(int[] arr){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
