package Week2;

/**
 * Created by Poosh on 07.07.2017.
 */
public class w2h3_5TEST {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3}; int exp1 = 6; int res1 = w2h3_5.sum3(nums1);
        int[] nums2 = {5, 11, 2}; int exp2 = 18; int res2 = w2h3_5.sum3(nums2);
        int[] nums3 = {7, 0, 0}; int exp3 = 7; int res3 = w2h3_5.sum3(nums3);
        int[] nums4 = {1, 2, 1}; int exp4 = 4; int res4 = w2h3_5.sum3(nums4);
        int[] nums5 = {1, 1, 1}; int exp5 = 3; int res5 = w2h3_5.sum3(nums5);
        int[] nums6 = {2, 7, 2}; int exp6 = 11; int res6 = w2h3_5.sum3(nums6);

        int exp = exp6;
        int[] nums = nums6;
        int res = res6;

        System.out.println(meth_Arr.transfArrToStr(nums));
        System.out.println("Expected: " + exp);
        System.out.println("Result: " + res);
        System.out.println(exp == res ? "Result is correct": "Result is'nt correct!!!");
    }
}
