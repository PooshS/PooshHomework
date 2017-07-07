package Week2;

/**
 * Created by Poosh on 07.07.2017.
 */
public class w2h3_1TEST {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 6}; boolean exp1 = true; boolean res1 = w2h3_1.firstLast6(nums1);
        int[] nums2 = {6, 1, 2, 3}; boolean exp2 = true; boolean res2 = w2h3_1.firstLast6(nums2);
        int[] nums3 = {13, 6, 1, 2, 3}; boolean exp3 = false; boolean res3 = w2h3_1.firstLast6(nums3);
        int[] nums4 = {13, 6, 1, 2, 6}; boolean exp4 = true; boolean res4 = w2h3_1.firstLast6(nums4);
        int[] nums5 = {3, 2, 1}; boolean exp5 = false; boolean res5 = w2h3_1.firstLast6(nums5);
        int[] nums6 = {3, 6, 1}; boolean exp6 = false; boolean res6 = w2h3_1.firstLast6(nums6);
        int[] nums7 = {3, 6}; boolean exp7 = true; boolean res7 = w2h3_1.firstLast6(nums7);
        int[] nums8 = {6}; boolean exp8 = true; boolean res8 = w2h3_1.firstLast6(nums8);
        int[] nums9 = {3}; boolean exp9 = false; boolean res9 = w2h3_1.firstLast6(nums9);
        int[] nums10 = {5, 6}; boolean exp10 = true; boolean res10 = w2h3_1.firstLast6(nums10);
        int[] nums11 = {5, 5}; boolean exp11 = false; boolean res11 = w2h3_1.firstLast6(nums11);
        int[] nums12 = {1, 2, 3, 4, 6}; boolean exp12 = true; boolean res12 = w2h3_1.firstLast6(nums12);
        int[] nums13 = {1, 2, 3, 4}; boolean exp13 = false; boolean res13 = w2h3_1.firstLast6(nums13);

        boolean exp = exp13;
        int[] nums = nums13;
        boolean res = res13;

        System.out.println(meth_Arr.transfArrToStr(nums));
        System.out.println("Expected: " + exp);
        System.out.println("Result: " + res);
        System.out.println(exp == res ? "Result is correct": "Result is'nt correct!!!");
    }
}