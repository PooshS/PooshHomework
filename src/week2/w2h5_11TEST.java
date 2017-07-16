package week2;

/**
 * Created by Poosh on 09.07.2017.
 */
public class w2h5_11TEST {
    public static void main(String[] args) {
        String a1 = "Hi"; String b1 = "Bye"; String exp1 = "HiByeByeHi"; String res1 = w2h5_11.makeAbba(a1, b1);
        String a2 = "Yo"; String b2 = "Alice"; String exp2 = "YoAliceAliceYo"; String res2 = w2h5_11.makeAbba(a2, b2);
        String a3 = "What"; String b3 = "Up"; String exp3 = "WhatUpUpWhat"; String res3 = w2h5_11.makeAbba(a3, b3);

        String exp = exp3;
        String a =     a3;
        String b =     b3;
        String res = res3;

        System.out.println("Expected: " + exp);
        System.out.println("Result: " + res);
    }
}
