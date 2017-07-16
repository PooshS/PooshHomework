package week2;

/**
 * Created by Poosh on 10.07.2017.
 *
     Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

     firstHalf("WooHoo") → "Woo"
     firstHalf("HelloThere") → "Hello"
     firstHalf("abcdef") → "abc"
 */
public class w2h5_16 {
    public static String firstHalf(String str) {
        if(str.length() == 0) return "string of zero length";
        else if(str.length() % 2 !=0) return "string of odd length";
        else return str.substring(0, str.length()/2);
    }
}
