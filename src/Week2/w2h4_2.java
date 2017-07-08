package Week2;

import Week2.Methods.ArrayUtils;

/**
 * Created by Poosh on 08.07.2017.
 */
public class w2h4_2 {
    public static void main(String[] args) {
        int[] arr = ArrayUtils.generateArr();

        int min = arr[0]; int indxMin = 0;
        int max = arr[0]; int indxMax = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                indxMin = i;
            }
            if(arr[i] > max){
                max = arr[i];
                indxMax = i;
            }
        }

        System.out.print("Generated arr: ");
        ArrayUtils.printArr(arr);

        arr[indxMax] = min;
        arr[indxMin] = max;

        System.out.println("Min of arr = " + min + ", Max of arr = " + max);

        System.out.print("Modified arr: ");
        ArrayUtils.printArr(arr);
    }
}
