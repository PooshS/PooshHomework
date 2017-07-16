package week2;

/**
 * Created by Poosh on 09.07.2017.
 */
public class w2h5_4TEST {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 2, 1}; int exp1 = 6; int res1 = w2h5_4.sum13(num1);
        int[] num2 = {1, 1}; int exp2 = 2; int res2 = w2h5_4.sum13(num2);
        int[] num3 = {1, 2, 2, 1, 13}; int exp3 = 6; int res3 = w2h5_4.sum13(num3);
        int[] num4 = {1, 2, 2, 1, 13, 1, 2, 2, 1, 13}; int exp4 = 11; int res4 = w2h5_4.sum13(num4);
        int[] num5 = {5, 7, 2}; int exp5 = 14; int res5 = w2h5_4.sum13(num5);

        int exp =     exp5;
        int[] nums =  num5;
        int res =     res5;

        System.out.println(meth_Arr.transfArrToStr(nums));
        System.out.println("Expected: " + exp);
        System.out.println("Result: " + res);
        System.out.println(exp == res ? "Result is correct": "Result is'nt correct!!!");
    }
}
