package Week2;

/**
 * Created by Poosh on 07.07.2017.
 */
public class w2h3_9 {
    public static int sum2(int[] nums) {
        int sum2;
        if(nums.length >= 2){
            sum2 = nums[0] + nums[1];
        }else if (nums.length == 1){
            sum2 = nums[0];
        } else sum2 = 0;
        return sum2;
    }
}
