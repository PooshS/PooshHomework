package week2;

/**
 * Created by Poosh on 09.07.2017.
 *
     Given an array of ints, return true if the number of 1's is greater than the number of 4's

     more14([1, 4, 1]) → true
     more14([1, 4, 1, 4]) → false
     more14([1, 1]) → true
 */

public class w2h5_9 {
    public static boolean more14(int[] nums) {
        if(nums.length == 0 ) return false;

        int cntr1 = 0;
        int cntr4 = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1) cntr1++;
            if(nums[i] == 4) cntr4++;
        }

        return cntr1 > cntr4;
    }
}
