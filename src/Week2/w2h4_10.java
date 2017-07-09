package Week2;

import Week2.Methods.ArrayUtils;

import java.util.Scanner;

/**
 * Created by Poosh on 08.07.2017.
 */
public class w2h4_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();

        System.out.println("Enter start o range:");
        int start = sc.nextInt();
        System.out.println("Enter end of range:");
        int end = sc.nextInt();

        int[] arr = ArrayUtils.generateArr(size);
        ArrayUtils.printArr(arr);

        int[] arrN = ArrayUtils.splitArray(arr, start, end);
        ArrayUtils.printArr(arrN);
    }

    /*public static int[] splitArray(int[] arr, int start, int end){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= start && arr[i] <= end) count++;
        }

        int [] arrNew = new int[count];
        int j = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= start && arr[i] <= end){
                arrNew[j] = arr[i];
                j++;
            }
        }
        return arrNew;
    }*/
}
