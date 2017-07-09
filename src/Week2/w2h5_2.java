package Week2;

/**
 * Created by Poosh on 09.07.2017.
 *
 Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
 Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.

 bigDiff([10, 3, 5, 6]) → 7
 bigDiff([7, 2, 10, 9]) → 8
 bigDiff([2, 10, 7, 2]) → 8
 */
public class w2h5_2 {
    public static int bigDiff(int[] nums) {

        if(nums.length == 0 ) return 0;

        int max = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max) max = nums[i];
        }

        int min = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min) min = nums[i];
        }

        int bigDiff = max - min;
        return bigDiff;
    }
}
