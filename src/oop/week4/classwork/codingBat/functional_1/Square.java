package oop.week4.classwork.codingBat.functional_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Square {

    public static void main(String[] args) {
       // square([1, 2, 3]);
    }

    /*Given a list of integers, return a list where each integer is multiplied with itself.

            square([1, 2, 3]) → [1, 4, 9]
    square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
    square([]) → []*/

    public static List<Integer> square(List<Integer> nums) {

        return  nums.stream().map(n -> n * n).collect(Collectors.toList());

    }


    /*Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.

    two2([1, 2, 3]) → [4, 6]
    two2([2, 6, 11]) → [4]
    two2([0]) → [0]*/

    public List<Integer> two2(List<Integer> nums) {

        return null;

    }


}
