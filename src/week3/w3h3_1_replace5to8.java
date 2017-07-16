package week3;

import java.util.Scanner;

/**
 * Created by Poosh on 16.07.2017.
 */
public class w3h3_1_replace5to8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix size:");
        int size = sc.nextInt();

        int[][] mat = w3_matrixUtils.matGen(size);

        System.out.println("First matrix (befor replace 5 to 8)");
        w3_matrixUtils.matPrint(mat);

        for(int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if(mat[i][j] % 5 ==0){
                    mat[i][j] = 8;
                };
            }
        }

        System.out.println("Result after replace 5 to 8)");
        w3_matrixUtils.matPrint(mat);
    }
}
