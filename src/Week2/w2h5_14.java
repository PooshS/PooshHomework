package Week2;

/**
 * Created by Poosh on 09.07.2017.
 *
     Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.

     extraEnd("Hello") → "lololo"
     extraEnd("ab") → "ababab"
     extraEnd("Hi") → "HiHiHi"
 */

public class w2h5_14 {
    public static String extraEnd(String str) {
        if (str.length() < 2) return "";

        String extraEnd = str.substring((str.length()-2));
        return extraEnd + extraEnd + extraEnd;
    }
}
