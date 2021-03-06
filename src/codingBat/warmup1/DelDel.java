package codingBat.warmup1;

/**
 Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted.
 Otherwise, return the string unchanged.

 delDel("adelbc") → "abc"
 delDel("adelHello") → "aHello"
 delDel("adedbc") → "adedbc"
 */

public class DelDel {
    public static String delDel(String str) {
        if (str.length() >= 4) {
            if(str.substring(1,4).equals("del")){
                return str.charAt(0) + str.substring(4, str.length());
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(delDel("adelr"));
    }
}
