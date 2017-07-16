package week2;

/**
 * Created by Poosh on 09.07.2017.
 */
public class w2h5_12TEST {
    public static void main(String[] args) {
        String tag1 = "i"; String word1 = "Yay"; String exp1 = "<i>Yay</i>"; String res1 = w2h5_12.makeTags(tag1, word1);
        String tag2 = "i"; String word2 = "Hello"; String exp2 = "<i>Hello</i>"; String res2 = w2h5_12.makeTags(tag2, word2);
        String tag3 = "cite"; String word3 = "Yay"; String exp3 = "<cite>Yay</cite>"; String res3 = w2h5_12.makeTags(tag3, word3);

        String exp =   exp3;
        String tag =   tag3;
        String word = word3;
        String res =   res3;

        System.out.println("Expected: " + exp);
        System.out.println("Result: " + res);
    }
}
