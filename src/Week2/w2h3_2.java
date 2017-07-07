package Week2;

/**
 * Created by Poosh on 07.07.2017.
 */
public class w2h3_2 {
    public static boolean sameFirstLast(int[] nums) {
        boolean sameFirstLast;

        if(nums.length >= 1 && nums[0] == nums[(nums.length-1)]) {
            sameFirstLast = true;
        } else sameFirstLast = false;

        return sameFirstLast;
    }
}
