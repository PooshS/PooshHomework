package week3;

/*
 3.5. а) Поменять наибольшую строку массива с наименьшей в двухмерном массиве. (Размер - сумма элементов в строке)
 */

import java.util.Scanner;

public class w3h3_5_a_matChange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix size1:");
        int size1 = sc.nextInt();
        System.out.println("Enter matrix size2:");
        int size2 = sc.nextInt();

        int[][] mat = w3_matrixUtils.matGenS1S2(size1, size2);

        System.out.println("Created matrix:");
        w3_matrixUtils.matPrint(mat);
        System.out.println();

        int tmp;
        int rowMax = 0;
        int iMax = 0;
        int iMin = 0;
        int rowMin = 0;

        for(int i = 0; i < mat.length; i++){
            int sum = 0;
            for(int j = 0; j < mat[i].length; j++){
                sum = sum + mat[i][j];
            }
            System.out.println("sum of " + i + " column = " + sum);
            if(i == 0){
                rowMax = sum;
                rowMin = sum;
            } else {
                if(sum > rowMax){
                    rowMax = sum;
                    iMax = i;
                }
                if(sum < rowMin && rowMin !=0){
                    rowMin = sum;
                    iMin = i;
                }
            }
        }

        for (int j = 0; j < mat[iMax].length; j++){
            tmp = mat[iMin][j];
            mat[iMin][j] = mat[iMax][j];
            mat[iMax][j] = tmp;
        }

        System.out.println("Result:");
        w3_matrixUtils.matPrint(mat);
        System.out.println("Max = " + rowMax + "; iMax = " + iMax);
        System.out.println("Min = " + rowMin + "; iMin = " + iMin);
    }

}
