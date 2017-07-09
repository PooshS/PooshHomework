package Week2;

/**
 * Created by Poosh on 09.07.2017.
 */
public class w2h5_7TEST {
    public static void main(String[] args) {
        int[] num1 = {0, 2, 4}; boolean exp1 = true; boolean res1 = w2h5_7.lucky13(num1);
        int[] num2 = {1, 2, 3}; boolean exp2 = false; boolean res2 = w2h5_7.lucky13(num2);
        int[] num3 = {1, 2, 4}; boolean exp3 = false; boolean res3 = w2h5_7.lucky13(num3);

        boolean exp = exp3;
        int[] nums =  num3;
        boolean res = res3;

        System.out.println(meth_Arr.transfArrToStr(nums));
        System.out.println("Expected: " + exp);
        System.out.println("Result: " + res);
        System.out.println(exp == res ? "Result is correct": "Result is'nt correct!!!");
    }
}
