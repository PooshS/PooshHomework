package week2;

/**
 * Created by Poosh on 09.07.2017.
 *
     Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values
 in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce
 the final average. You may assume that the array is length 3 or more.

     centeredAverage([1, 2, 3, 4, 100]) → 3
     centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
     centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
 */
public class w2h5_3 {
    public static int centeredAverage(int[] nums) {

        if(nums.length < 3 ) return 0;

        int max = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max) max = nums[i];
        }

        int min = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min) min = nums[i];
        }

        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }

        int centeredAverage = (sum - max - min)/(nums.length - 2);

        return centeredAverage;
    }
}
