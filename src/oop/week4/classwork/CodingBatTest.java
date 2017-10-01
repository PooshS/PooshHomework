package oop.week4.classwork;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Poosh on 24.09.2017.
 */

/*Given a list of non-negative integers, return a list of those numbers multiplied by 2,
omitting any of the resulting numbers that end in 2.

        two2([1, 2, 3]) → [4, 6]
        two2([2, 6, 11]) → [4]
        two2([0]) → [0]*/


public class CodingBatTest {

    public static void main(String[] args) {

        Integer[] test = {0};
        List<Integer> testL = Arrays.asList(test);
        printlist(two2(testL));

    }

    public static void printlist(List<Integer> nums){
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
    }



    public static List<Integer> two2(List<Integer> nums) {
        return nums.stream().map(n -> n * 2).filter(m -> m % 10 != 2).collect(Collectors.toList());
    }

}
