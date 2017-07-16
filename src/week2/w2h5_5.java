package week2;

/**
 * Created by Poosh on 09.07.2017.
 *
     Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7
     every 6 will be followed by at least one 7). Return 0 for no numbers.

     sum67([1, 2, 2]) → 5
     sum67([1, 2, 2, 6, 99, 99, 7]) → 5
     sum67([1, 1, 6, 7, 2]) → 4
 */
public class w2h5_5 {
    public static int sum67(int[] nums) {
        if(nums.length == 0 ) return 0;

        int sum67 = 0;
        boolean notEncl = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 6){
                notEncl = true;
            } else if(nums[i] == 7){
                if(notEncl == false) sum67 = sum67 + nums[i];
                else notEncl = false;
            } else if(notEncl == false){
                sum67 = sum67 + nums[i];
            }
        }

        return sum67;
    }
}
