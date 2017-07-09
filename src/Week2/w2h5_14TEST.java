package Week2;

/**
 * Created by Poosh on 09.07.2017.
 */
public class w2h5_14TEST {
    public static void main(String[] args) {
        String str1 = "Hello"; String exp1 = "lololo"; String res1 = w2h5_14.extraEnd(str1);
        String str2 = "ab"; String exp2 = "ababab"; String res2 = w2h5_14.extraEnd(str2);
        String str3 = "Hi"; String exp3 = "HiHiHi"; String res3 = w2h5_14.extraEnd(str3);

        String exp =   exp3;
        String tag =   str3;
        String res =   res3;

        System.out.println("Expected: " + exp);
        System.out.println("Result: " + res);
    }
}
