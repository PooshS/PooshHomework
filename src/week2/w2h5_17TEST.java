package week2;

/**
 * Created by Poosh on 10.07.2017.
 */
public class w2h5_17TEST {
    public static void main(String[] args) {
        String str1 = "Hello"; String exp1 = "ell"; String res1 = w2h5_17.withoutEnd(str1);
        String str2 = "java"; String exp2 = "av"; String res2 = w2h5_17.withoutEnd(str2);
        String str3 = "coding"; String exp3 = "odin"; String res3 = w2h5_17.withoutEnd(str3);
        String str4 = "y"; String exp4 = ""; String res4 = w2h5_17.withoutEnd(str4);
        String str5 = ""; String exp5 = ""; String res5 = w2h5_17.withoutEnd(str5);


        String exp =   exp5;
        String res =   res5;

        System.out.println("Expected: " + exp);
        System.out.println("Result: " + res);
    }
}
