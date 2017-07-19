package week3;

import java.util.Scanner;

/*
    3.5. b) Поменять наибольший и наименьший столбик в двухмерном массиве.
 */

public class w3h3_5_b_matChange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int size1 = sc.nextInt();
        System.out.println("Enter number of columns:");
        int size2 = sc.nextInt();

        int[][] mat = w3_matrixUtils.matGenS1S2(size1, size2);

        System.out.println("Created matrix:");
        w3_matrixUtils.matPrint(mat);
        System.out.println();

        int tmp;
        int colMax = 0;
        int jMax = 0;
        int jMin = 0;
        int colMin = 0;

        int i = 0;
        for(int j = 0; j < mat[i].length; j++){
            int sum = 0;
            for(i = 0; i < mat.length; i++){
                sum = sum + mat[i][j];
            }

            i = 0;

            if(j == 0){
                colMax = sum;
                colMin = sum;
            } else {
                if(sum > colMax){
                    colMax = sum;
                    jMax = j;
                }
                if(sum < colMin){
                    colMin = sum;
                    jMin = j;
                }
            }
        }

        for (i = 0; i < mat.length; i++) {
            tmp = mat[i][jMax];
            mat[i][jMax] = mat[i][jMin];
            mat[i][jMin] = tmp;
        }

        System.out.println("Result:");
        w3_matrixUtils.matPrint(mat);
        System.out.println();
        System.out.println("Max = " + colMax + "; jMax = " + jMax);
        System.out.println("Min = " + colMin + "; jMin = " + jMin);
    }
}
