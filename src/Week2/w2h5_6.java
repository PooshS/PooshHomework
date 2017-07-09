package Week2;

/**
 * Created by Poosh on 09.07.2017.
 *
     Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.

     has22([1, 2, 2]) → true
     has22([1, 2, 1, 2]) → false
     has22([2, 1, 2]) → false
 */
public class w2h5_6 {
    public static boolean has22(int[] nums) {
        if(nums.length == 0 ) return false;

        boolean has22 = false;
        boolean was2 = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 2){
                if(was2) has22 = true;
                was2 = true;
            } else was2 = false;
        }

        return has22;
    }
}
