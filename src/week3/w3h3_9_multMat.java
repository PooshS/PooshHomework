package week3;

import com.sun.org.apache.xpath.internal.SourceTree;

/*
 3.9. Умножить две матрицы.
 */

public class w3h3_9_multMat {
    public static void main(String[] args) {
        int [][] mat1 = {{1, 2, 3}, {4, 5, 6}};
        int [][] mat2 = {{6, 5}, {4, 3}, {2, 1}};
        int r = mat1.length;
        int c = mat2[0].length;
        int [][] matRes = new int[r][c];

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                for(int k = 0; k < mat2.length; k++){
                    matRes[i][j] = matRes[i][j] + mat1[i][k] * mat2[k][j];
                }
            }
        }

        for(int i = 0; i < matRes.length; i++){
            for(int j = 0; j < matRes[i].length; j++){
                System.out.print(matRes[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
