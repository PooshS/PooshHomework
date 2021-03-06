package week2;

/**
 * Created by Poosh on 09.07.2017.
 */

/*
    Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

    countEvens([2, 1, 2, 3, 4]) → 3
    countEvens([2, 2, 0]) → 3
    countEvens([1, 3, 5]) → 0
*/

public class w2h5_1 {
    public static int countEvens(int[] nums) {
        int countEvent = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) countEvent++;
        }
        return countEvent;
    }
}
