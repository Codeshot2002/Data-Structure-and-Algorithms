package com.company.dsa.pactice;

import java.util.Arrays;

public class matrix_prac {
    public boolean rotateMatrix(int[][] matrix){
        if(matrix.length == 0 || matrix.length != matrix[0].length){
            return false;
        }
        int row = matrix.length;
        for(int layer = 0; layer < row/2; layer++){
            int first = layer;
            int last = row-1-layer;
            for (int i=first;i<last;i++){
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(matrix));
        int row = matrix.length;
        int column = matrix[0].length;
        System.out.println("row : " + row);
        System.out.println("Column : " + column);
        System.out.println("----------");
        matrix_prac obj = new matrix_prac();
        obj.rotateMatrix(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
