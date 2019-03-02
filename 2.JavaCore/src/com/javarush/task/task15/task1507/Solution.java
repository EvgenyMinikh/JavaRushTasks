package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(){
        System.out.println("Test");
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
        }
    }

    public static void printMatrix(String title){
        System.out.println(title);
    }

    public static int printMatrix(int n, int m){
        return n*m;
    }

    public static int printMatrix(int n, int m, int k){
        return n*m*k;
    }

    public static double printMatrix(double n, double m){
        return n*m;
    }

    public static String printMatrix(Object o){
        return o.getClass().getSimpleName();
    }

    public static Object printMatrix(Object o, boolean life){
        boolean is = true;
        if (life || is || life)
            return o;
        return null;
    }
}
