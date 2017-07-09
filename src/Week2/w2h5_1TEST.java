package Week2;

import Week2.Methods.ArrayUtils;

import java.util.Scanner;

/**
 * Created by Poosh on 09.07.2017.
 */
public class w2h5_1TEST {
    public static void main(String[] args) {
        int[] nums1 = {2, 1, 2, 3, 4}; int exp1 = 3; int res1 = w2h5_1.countEvens(nums1);
        int[] nums2 = {2, 2, 0}; int exp2 = 3; int res2 = w2h5_1.countEvens(nums2);
        int[] nums3 = {1, 3, 5}; int exp3 = 0; int res3 = w2h5_1.countEvens(nums3);
        int[] nums4 = {}; int exp4 = 0; int res4 = w2h5_1.countEvens(nums4);

        int exp =     exp4;
        int[] nums = nums4;
        int res =     res4;

        System.out.println(meth_Arr.transfArrToStr(nums));
        System.out.println("Expected: " + exp);
        System.out.println("Result: " + res);
        System.out.println(exp == res ? "Result is correct": "Result is'nt correct!!!");
    }
}
