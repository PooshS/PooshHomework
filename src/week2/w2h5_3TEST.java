package week2;

/**
 * Created by Poosh on 09.07.2017.
 */
public class w2h5_3TEST {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 4, 100}; int exp1 = 3; int res1 = w2h5_3.centeredAverage(num1);
        int[] num2 = {1, 1, 5, 5, 10, 8, 7}; int exp2 = 5; int res2 = w2h5_3.centeredAverage(num2);
        int[] num3 = {-10, -4, -2, -4, -2, 0}; int exp3 = -3; int res3 = w2h5_3.centeredAverage(num3);
        int[] num4 = {}; int exp4 = 0; int res4 = w2h5_3.centeredAverage(num4);

        int exp =     exp4;
        int[] nums =  num4;
        int res =     res4;

        System.out.println(meth_Arr.transfArrToStr(nums));
        System.out.println("Expected: " + exp);
        System.out.println("Result: " + res);
        System.out.println(exp == res ? "Result is correct": "Result is'nt correct!!!");
    }
}
