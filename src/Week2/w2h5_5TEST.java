package Week2;

/**
 * Created by Poosh on 09.07.2017.
 */
public class w2h5_5TEST {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 2}; int exp1 = 5; int res1 = w2h5_5.sum67(num1);
        int[] num2 = {1, 2, 2, 6, 99, 99, 7}; int exp2 = 5; int res2 = w2h5_5.sum67(num2);
        int[] num3 = {1, 1, 6, 7, 2}; int exp3 = 4; int res3 = w2h5_5.sum67(num3);
        int[] num4 = {2, 7, 6, 2, 6, 7, 2, 7}; int exp4 = 18; int res4 = w2h5_5.sum67(num4);
        int[] num5 = {2, 7, 6, 2, 6, 2, 7}; int exp5 = 9; int res5 = w2h5_5.sum67(num5);

        int exp =     exp5;
        int[] nums =  num5;
        int res =     res5;

        System.out.println(meth_Arr.transfArrToStr(nums));
        System.out.println("Expected: " + exp);
        System.out.println("Result: " + res);
        System.out.println(exp == res ? "Result is correct": "Result is'nt correct!!!");
    }
}
