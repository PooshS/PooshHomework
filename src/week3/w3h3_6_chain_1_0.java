package week3;

/*
 3.6. Нули

 Требуется найти самую длинную непрерывную цепочку нулей и единиц в последовательности цифр.
 */

import java.util.Scanner;

public class w3h3_6_chain_1_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string of 1 and 0:");
        String str = sc.next();

        int ch0 = 0;
        int ch0f = 0;
        int ch0l = 0;
        int ch0max = 0;
        int ch1 = 0;
        int ch1f = 0;
        int ch1l = 0;
        int ch1max = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.codePointAt(i) == 48){
                if(ch1 > ch1max) {
                    ch1max = ch1;
                    ch1f = i - ch1;
                    ch1l = i - 1;
                }
                ch1 = 0;
                ch0 += 1;
            } else if(str.codePointAt(i) == 49){
                if(ch0 > ch0max) {
                    ch0max = ch0;
                    ch0f = i - ch0;
                    ch0l = i - 1;
                }
                ch0 = 0;
                ch1 += 1;
            } else System.out.println("Entered string is wrong!");
        }
        //System.out.println("ch0max = " + ch0max);
        //System.out.println("ch1max = " + ch1max);
        System.out.println("(" + (ch0f + 1) + "," + (ch0l + 1) + ") - цепочка нулей");
        System.out.println("(" + (ch1f + 1) + "," + (ch1l + 1) + ") - цепочка единиц");
    }
}
