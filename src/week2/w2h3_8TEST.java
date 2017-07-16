package week2;

/**
 * Created by Poosh on 07.07.2017.
 */
public class w2h3_8TEST {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3}; int[] exp1 = {3, 3, 3}; int[] res1 = w2h3_8.maxEnd3(nums1);
        int[] nums2 = {11, 5, 9}; int[] exp2 = {11, 11, 11}; int[] res2 = w2h3_8.maxEnd3(nums2);
        int[] nums3 = {2, 11, 3}; int[] exp3 = {3, 3, 3}; int[] res3 = w2h3_8.maxEnd3(nums3);
        int[] nums4 = {11, 3, 3}; int[] exp4 = {11, 11, 11}; int[] res4 = w2h3_8.maxEnd3(nums4);
        int[] nums5 = {3, 11, 11}; int[] exp5 = {11, 11, 11}; int[] res5 = w2h3_8.maxEnd3(nums5);
        int[] nums6 = {2, 2, 2}; int[] exp6 = {2, 2, 2}; int[] res6 = w2h3_8.maxEnd3(nums6);
        int[] nums7 = {2, 11, 2}; int[] exp7 = {2, 2, 2}; int[] res7 = w2h3_8.maxEnd3(nums7);
        int[] nums8 = {0, 0, 1}; int[] exp8 = {1, 1, 1}; int[] res8 = w2h3_8.maxEnd3(nums8);

        int[] exp = exp8;
        int[] nums = nums8;
        int[] res = res8;

        System.out.println(meth_Arr.transfArrToStr(nums));
        System.out.println("Expected: " + meth_Arr.transfArrToStr(exp));
        System.out.println("Result: " + meth_Arr.transfArrToStr(res));
        System.out.println(exp[0] == res[0] && exp[1] == res[1] && exp[2] == res[2] ? "Result is correct": "Result is'nt correct!!!");
    }
}
