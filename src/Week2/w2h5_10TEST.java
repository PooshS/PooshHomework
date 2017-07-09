package Week2;

/**
 * Created by Poosh on 09.07.2017.
 */
public class w2h5_10TEST {
    public static void main(String[] args) {
        String name1 = "Bob"; String exp1 = "Hello Bob!"; String res1 = w2h5_10.helloName(name1);
        String name2 = "Alice"; String exp2 = "Hello Alice!"; String res2 = w2h5_10.helloName(name2);
        String name3 = "X"; String exp3 = "Hello X!"; String res3 = w2h5_10.helloName(name3);

        String exp =   exp2;
        String name = name2;
        String res =   res2;

        System.out.println("Expected: " + exp);
        System.out.println("Result: " + res);
    }
}
