package week2;

/**
 * Created by Poosh on 07.07.2017.
 */
public class w2h3_8 {
    public static int[] maxEnd3(int[] nums) {
        int largest = nums[0] >= nums[2] ? nums[0] : nums [2];
        int[] maxEnd3 = {largest, largest, largest};
        return maxEnd3;
    }
}
