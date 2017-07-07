package Week2;

/**
 * Created by Poosh on 07.07.2017.
 */
public class w2h3_7TEST {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3}; int[] exp1 = {3, 2, 1}; int[] res1 = w2h3_7.reverse3(nums1);
        int[] nums2 = {5, 11, 9}; int[] exp2 = {9, 11, 5}; int[] res2 = w2h3_7.reverse3(nums2);
        int[] nums3 = {7, 0, 0}; int[] exp3 = {0, 0, 7}; int[] res3 = w2h3_7.reverse3(nums3);
        int[] nums4 = {2, 1, 1}; int[] exp4 = {1, 1, 2}; int[] res4 = w2h3_7.reverse3(nums4);
        int[] nums5 = {1, 2, 1}; int[] exp5 = {1, 2, 1}; int[] res5 = w2h3_7.reverse3(nums5);
        int[] nums6 = {2, 11, 3}; int[] exp6 = {3, 11, 2}; int[] res6 = w2h3_7.reverse3(nums6);
        int[] nums7 = {0, 6, 5}; int[] exp7 = {5, 6, 0}; int[] res7 = w2h3_7.reverse3(nums7);
        int[] nums8 = {7, 2, 3}; int[] exp8 = {3, 2, 7}; int[] res8 = w2h3_7.reverse3(nums8);

        int[] exp = exp8;
        int[] nums = nums8;
        int[] res = res8;

        System.out.println(meth_Arr.transfArrToStr(nums));
        System.out.println("Expected: " + meth_Arr.transfArrToStr(exp));
        System.out.println("Result: " + meth_Arr.transfArrToStr(res));
        System.out.println(exp[0] == res[0] && exp[1] == res[1] && exp[2] == res[2] ? "Result is correct": "Result is'nt correct!!!");
    }
}
