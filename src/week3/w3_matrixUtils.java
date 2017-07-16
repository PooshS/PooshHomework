package week3;

/**
 * Created by Poosh on 16.07.2017.
 */
public class w3_matrixUtils {
    public static int[][] matGen(int size){
        int mat[][] = new int[size][size];
        for(int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = (int)(Math.random()*100);
            }
        }
        return mat;
    }

    public static void matPrint(int mat [][]){
        for(int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + ", ");
            }
            System.out.println("");
        }
    }
}
