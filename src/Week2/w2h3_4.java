package Week2;

/**
 * Created by Poosh on 07.07.2017.
 */
public class w2h3_4 {
    public static boolean commonEnd(int[] a, int[] b) {
        boolean firstLast;

        if(a[0] == b[0] || a[(a.length-1)] == b[(b.length-1)]) {
            firstLast = true;
        } else firstLast = false;

        return firstLast;
    }
}
