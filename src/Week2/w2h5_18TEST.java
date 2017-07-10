package Week2;

/**
 * Created by Poosh on 10.07.2017.
 */
public class w2h5_18TEST {
    public static void main(String[] args) {
        String a1 = "Hello"; String b1 = "hi"; String exp1 = "hiHellohi"; String res1 = w2h5_18.comboString(a1, b1);
        String a2 = "hi"; String b2 = "Hello"; String exp2 = "hiHellohi"; String res2 = w2h5_18.comboString(a2, b2);
        String a3 = "aaa"; String b3 = "b"; String exp3 = "baaab"; String res3 = w2h5_18.comboString(a3, b3);
        String a4 = ""; String b4 = "bb"; String exp4 = "bb"; String res4 = w2h5_18.comboString(a4, b4);
        String a5 = "a"; String b5 = "b"; String exp5 = "equal length"; String res5 = w2h5_18.comboString(a5, b5);


        String exp =   exp5;
        String res =   res5;

        System.out.println("Expected: " + exp);
        System.out.println("Result: " + res);
    }
}
