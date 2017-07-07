package Week2;

/**
 * Created by Poosh on 07.07.2017.
 */
public class meth_Arr {
    public static String transfArrToStr(int[] mas){
        String res = "";

        for(int i = 0; i < mas.length; i++){
            res = res + mas[i] + ",";
        }
        return res;
    }
}
