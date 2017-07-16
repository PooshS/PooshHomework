package week2;

/**
 * Created by Poosh on 07.07.2017.
 */
public class w2h3_6TEST {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3}; int[] exp1 = {2, 3, 1}; int[] res1 = w2h3_6.rotateLeft3(nums1);
        int[] nums2 = {5, 11, 9}; int[] exp2 = {11, 9, 5}; int[] res2 = w2h3_6.rotateLeft3(nums2);
        int[] nums3 = {7, 0, 0}; int[] exp3 = {0, 0, 7}; int[] res3 = w2h3_6.rotateLeft3(nums3);
        int[] nums4 = {1, 2, 1}; int[] exp4 = {2, 1, 1}; int[] res4 = w2h3_6.rotateLeft3(nums4);
        int[] nums5 = {0, 0, 1}; int[] exp5 = {0, 1, 0}; int[] res5 = w2h3_6.rotateLeft3(nums5);

        int[] exp = exp5;
        int[] nums = nums5;
        int[] res = res5;

        System.out.println(meth_Arr.transfArrToStr(nums));
        System.out.println("Expected: " + meth_Arr.transfArrToStr(exp));
        System.out.println("Result: " + meth_Arr.transfArrToStr(res));
        System.out.println(exp[0] == res[0] && exp[1] == res[1] && exp[2] == res[2] ? "Result is correct": "Result is'nt correct!!!");
    }
}
