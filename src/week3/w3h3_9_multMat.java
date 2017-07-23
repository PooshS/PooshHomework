package week3;

/**
 * Created by Poosh on 23.07.2017.
 */
public class w3h3_9_multMat {
    public static void main(String[] args) {
        int [][] mat1 = {{1, 2}, {3, 4}};
        int [][] mat2 = {{5, 6}, {7, 8}};
        int [][] matRes = new int[2][2];

        System.out.println("mat1.length = " + mat1.length);
        System.out.println("mat1[0].length = " + mat1[0].length);

        /*int j = 0;
        for(int i = 0; i < mat1[j].length; i++){
            for(; j < mat1.length; j++){
                matRes[i][j] = mat1[i][1] * mat2[1][j] + mat1[i][j + 1] * mat2[i + 1][j];
            }
        }*/

    }
}
