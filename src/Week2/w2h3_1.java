package Week2;

/**
 * Created by Poosh on 07.07.2017.
 */

/*
* Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
* firstLast6([1, 2, 6]) → true
* firstLast6([6, 1, 2, 3]) → true
* firstLast6([13, 6, 1, 2, 3]) → false
*/
public class w2h3_1 {

    public static boolean firstLast6(int[] nums) {
        boolean firstLast6;

        if(nums[0] == 6 || nums[(nums.length-1)] == 6) {
            firstLast6 = true;
        } else firstLast6 = false;

        return firstLast6;
    }
}
