package Week2;

/**
 * Created by Poosh on 07.07.2017.
 */
public class w2h3_2TEST {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3}; boolean exp1 = false; boolean res1 = w2h3_2.sameFirstLast(nums1);
        int[] nums2 = {1, 2, 3, 1}; boolean exp2 = true; boolean res2 = w2h3_2.sameFirstLast(nums2);
        int[] nums3 = {1, 2, 1}; boolean exp3 = true; boolean res3 = w2h3_2.sameFirstLast(nums3);
        int[] nums4 = {}; boolean exp4 = false; boolean res4 = w2h3_2.sameFirstLast(nums4);

        boolean exp = exp4;
        int[] nums = nums4;
        boolean res = res4;

        System.out.println(meth_Arr.transfArrToStr(nums));
        System.out.println("Array length is " + nums.length);
        System.out.println("Expected: " + exp);
        System.out.println("Result: " + res);
        System.out.println(exp == res ? "Result is correct": "Result is'nt correct!!!");
    }
}
