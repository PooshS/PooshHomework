package week2;

/**
 * Created by Poosh on 09.07.2017.
 */
public class w2h5_8TEST {
    public static void main(String[] args) {
        int[] num1 = {2, 3, 2, 2, 4, 2}; boolean exp1 = true; boolean res1 = w2h5_8.sum28(num1);
        int[] num2 = {2, 3, 2, 2, 4, 2, 2}; boolean exp2 = false; boolean res2 = w2h5_8.sum28(num2);
        int[] num3 = {1, 2, 3, 4}; boolean exp3 = false; boolean res3 = w2h5_8.sum28(num3);

        boolean exp = exp2;
        int[] nums =  num2;
        boolean res = res2;

        System.out.println(meth_Arr.transfArrToStr(nums));
        System.out.println("Expected: " + exp);
        System.out.println("Result: " + res);
        System.out.println(exp == res ? "Result is correct": "Result is'nt correct!!!");
    }
}
