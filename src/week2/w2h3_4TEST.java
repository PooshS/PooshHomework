package week2;

/**
 * Created by Poosh on 07.07.2017.
 */
public class w2h3_4TEST {
    public static void main(String[] args) {

        int[] a1 = {1, 2, 3}; int[] b1 = {7, 3}; boolean exp1 = true; boolean res1 = w2h3_4.commonEnd(a1, b1);
        int[] a2 = {1, 2, 3}; int[] b2 = {7, 3, 2}; boolean exp2 = false; boolean res2 = w2h3_4.commonEnd(a2, b2);
        int[] a3 = {1, 2, 3}; int[] b3 = {1, 3}; boolean exp3 = true; boolean res3 = w2h3_4.commonEnd(a3, b3);
        int[] a4 = {1, 2, 3}; int[] b4 = {1}; boolean exp4 = true; boolean res4 = w2h3_4.commonEnd(a4, b4);
        int[] a5 = {1, 2, 3}; int[] b5 = {2}; boolean exp5 = false; boolean res5 = w2h3_4.commonEnd(a5, b5);

        boolean exp = exp5;
        int[] a = a5;
        int[] b = b5;
        boolean res = res5;

        System.out.println(meth_Arr.transfArrToStr(a));
        System.out.println(meth_Arr.transfArrToStr(b));
        System.out.println("Expected: " + exp);
        System.out.println("Result: " + res);
        System.out.println(exp == res ? "Result is correct": "Result is'nt correct!!!");
    }
}
