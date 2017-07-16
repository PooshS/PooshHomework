package week3;

import java.util.Scanner;

/*
 3.2. Создать логическую матрицу по следующим критериям, если і равно j, то элементом будет true.
 */

public class w3h3_2logicMat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix size:");
        int size = sc.nextInt();

        boolean [][] logicMat = w3_matrixUtils.logicMatGen(size);

        System.out.println("First matrix (befor replace false to true when i == j)");
        w3_matrixUtils.logicMatPrint(logicMat);

        for(int i = 0; i < logicMat.length; i++){
            for (int j = 0; j < logicMat[i].length; j++){
                if(i == j) {
                    logicMat[i][j] = true;
                }
            }
        }

        System.out.println("Result after replace false to true when i == j)");
        w3_matrixUtils.logicMatPrint(logicMat);
    }
}
