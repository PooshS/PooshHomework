package Week2;

/**
 * Created by Poosh on 10.07.2017.
 *
     Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.

     withoutEnd("Hello") → "ell"
     withoutEnd("java") → "av"
     withoutEnd("coding") → "odin"
 */
public class w2h5_17 {
    public static String withoutEnd(String str) {
        if(str.length() > 1) return str.substring(1,str.length()-1);
        else return "";
    }
}
