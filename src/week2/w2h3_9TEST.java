package week2;

/**
 * Created by Poosh on 07.07.2017.
 */
public class w2h3_9TEST {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3}; int exp1 = 3; int res1 = w2h3_9.sum2(nums1);
        int[] nums2 = {1, 1}; int exp2 = 2; int res2 = w2h3_9.sum2(nums2);
        int[] nums3 = {1, 1, 1, 1}; int exp3 = 2; int res3 = w2h3_9.sum2(nums3);
        int[] nums4 = {1, 2}; int exp4 = 3; int res4 = w2h3_9.sum2(nums4);
        int[] nums5 = {1}; int exp5 = 1; int res5 = w2h3_9.sum2(nums5);
        int[] nums6 = {}; int exp6 = 0; int res6 = w2h3_9.sum2(nums6);
        int[] nums7 = {4, 5, 6}; int exp7 = 9; int res7 = w2h3_9.sum2(nums7);
        int[] nums8 = {4}; int exp8 = 4; int res8 = w2h3_9.sum2(nums8);

        int exp = exp8;
        int[] nums = nums8;
        int res = res8;

        System.out.println(meth_Arr.transfArrToStr(nums));
        System.out.println("Expected: " + exp);
        System.out.println("Result: " + res);
        System.out.println(exp == res ? "Result is correct": "Result is'nt correct!!!");
    }
}
