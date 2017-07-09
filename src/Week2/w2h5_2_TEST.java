package Week2;

/**
 * Created by Poosh on 09.07.2017.
 */
public class w2h5_2_TEST {
    public static void main(String[] args) {
        int[] num1 = {10, 3, 5, 6}; int exp1 = 7; int res1 = w2h5_2.bigDiff(num1);
        int[] num2 = {7, 2, 10, 9}; int exp2 = 8; int res2 = w2h5_2.bigDiff(num2);
        int[] num3 = {2, 10, 7, 2}; int exp3 = 8; int res3 = w2h5_2.bigDiff(num3);
        int[] num4 = {}; int exp4 = 0; int res4 = w2h5_2.bigDiff(num4);

        int exp =     exp4;
        int[] nums =  num4;
        int res =     res4;

        System.out.println(meth_Arr.transfArrToStr(nums));
        System.out.println("Expected: " + exp);
        System.out.println("Result: " + res);
        System.out.println(exp == res ? "Result is correct": "Result is'nt correct!!!");
    }
}
