package week2;

/**
 * Created by Poosh on 10.07.2017.
 */
public class w2h5_16TEST {
    public static void main(String[] args) {
        String str1 = "WooHoo"; String exp1 = "Woo"; String res1 = w2h5_16.firstHalf(str1);
        String str2 = "HelloThere"; String exp2 = "Hello"; String res2 = w2h5_16.firstHalf(str2);
        String str3 = "abcdef"; String exp3 = "abc"; String res3 = w2h5_16.firstHalf(str3);
        String str4 = "y"; String exp4 = "string of odd length"; String res4 = w2h5_16.firstHalf(str4);
        String str5 = ""; String exp5 = "string of zero length"; String res5 = w2h5_16.firstHalf(str5);


        String exp =   exp4;
        String res =   res4;

        System.out.println("Expected: " + exp);
        System.out.println("Result: " + res);
    }
}
