package week2;

/**
 * Created by Poosh on 10.07.2017.
 */
public class w2h5_15TEST {
    public static void main(String[] args) {
        String str1 = "Hello"; String exp1 = "He"; String res1 = w2h5_15.firstTwo(str1);
        String str2 = "abcdefg"; String exp2 = "ab"; String res2 = w2h5_15.firstTwo(str2);
        String str3 = "ab"; String exp3 = "ab"; String res3 = w2h5_15.firstTwo(str3);
        String str4 = "y"; String exp4 = "y"; String res4 = w2h5_15.firstTwo(str4);
        String str5 = ""; String exp5 = ""; String res5 = w2h5_15.firstTwo(str5);


        String exp =   exp5;
        String res =   res5;

        System.out.println("Expected: " + exp);
        System.out.println("Result: " + res);
    }
}
