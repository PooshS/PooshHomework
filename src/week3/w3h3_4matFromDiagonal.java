package week3;

/*
 3.4. Создать массив, который будет состоять из диагонали матрици
 */

import java.util.Scanner;

public class w3h3_4matFromDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix size:");
        int size = sc.nextInt();

        int[][] mat = w3_matrixUtils.matGen(size);

        System.out.println("Created matrix:");
        w3_matrixUtils.matPrint(mat);


        int[] matDiag = new int[mat.length];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j <mat[i].length; j++){
                if(i == j){
                    matDiag[i] = mat[i][j];
                }
            }
        }

        System.out.println("Matrix from diagonal:");
        for(int i = 0; i < matDiag.length; i++){
            System.out.print(matDiag[i] + ", ");
        }
    }

}
