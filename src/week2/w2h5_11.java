package week2;

/**
 * Created by Poosh on 09.07.2017.
 *
     Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

     makeAbba("Hi", "Bye") → "HiByeByeHi"
     makeAbba("Yo", "Alice") → "YoAliceAliceYo"
     makeAbba("What", "Up") → "WhatUpUpWhat"
 */

public class w2h5_11 {
    public static String makeAbba(String a, String b) {
        String makeAbba = a + b + b + a;
        return makeAbba;
    }
}
