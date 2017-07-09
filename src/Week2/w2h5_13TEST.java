package Week2;

/**
 * Created by Poosh on 09.07.2017.
 */
public class w2h5_13TEST {
    public static void main(String[] args) {
        String out1 = "<<>>"; String word1 = "Yay"; String exp1 = "<<Yay>>"; String res1 = w2h5_13.makeOutWord(out1, word1);
        String out2 = "<<>>"; String word2 = "WooHoo"; String exp2 = "<<WooHoo>>"; String res2 = w2h5_13.makeOutWord(out2, word2);
        String out3 = "[[]]"; String word3 = "word"; String exp3 = "[[word]]"; String res3 = w2h5_13.makeOutWord(out3, word3);

        String exp =   exp2;
        String tag =   out2;
        String word = word2;
        String res =   res2;

        System.out.println("Expected: " + exp);
        System.out.println("Result: " + res);
    }
}
