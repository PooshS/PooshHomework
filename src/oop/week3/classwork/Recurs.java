package oop.week3.classwork;

public class Recurs {

    public static void main(String[] args) {

        String str = "8388";

        String start = str.substring(0, str.toCharArray().length - 1);
        String end = str.substring(str.toCharArray().length - 1);

        System.out.println(start);
        System.out.println(end);

        System.out.println(Test.rec("8388") ) ;
        }
}

class Test{

    public static int rec(String string) {

        if (string == null || string.isEmpty()) {
            return 0;
        }

        int res;

        String start = string.substring(0, string.toCharArray().length - 1);
        String end = string.substring(string.toCharArray().length - 1);

        if (end.equals("8")) {
            res = 1;
        } else {
            res = 0;
        }
        return res + rec(start);

    }
}
