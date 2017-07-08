package Week2;

import Week2.Methods.ArrayUtils;

/**
 * Created by Poosh on 08.07.2017.
 */
public class w2h4_1 {
    public static void main(String[] args) {
        int[] arr = ArrayUtils.generateArr();

        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min) min = arr[i];
            if(arr[i] > max) max = arr[i];
        }
        System.out.println("Min of arr = " + min + ", Max of arr = " + max);

        System.out.print("Generated arr: ");
        ArrayUtils.printArr(arr);
    }
}
