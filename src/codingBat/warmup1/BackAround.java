package codingBat.warmup1;

/**
 Given a string, take the last char and return a new string with the last char added at the front and back,
 so "cat" yields "tcatt". The original string will be length 1 or more.

 backAround("cat") → "tcatt"
 backAround("Hello") → "oHelloo"
 backAround("a") → "aaa"
 */

public class BackAround {
    public static String backAround(String str) {
        if(str.length() >=1) {
            char c = str.charAt(str.length()-1);
            return c + str + c;
        }
        else return "invalid str";
    }

    public static void main(String[] args) {
        System.out.println(backAround("H"));
    }
}
