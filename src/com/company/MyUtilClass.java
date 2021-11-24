package com.company;

public final class MyUtilClass {

    //Print a 2D Array or Matrix using single loop
    public static void printAllElementInMatrix(int[][] matrix) {

        int innerArrayLength = 0;
        int actualNumberOfCircle = 0;

        for (int i = 0; i < matrix.length; i++) {
            if (innerArrayLength < matrix[i].length) {
                System.out.print(matrix[i][innerArrayLength] + " ");
                innerArrayLength++;

                //result of experience
                i = actualNumberOfCircle - 1;
            } else {

                innerArrayLength = 0;
                actualNumberOfCircle++;
                System.out.println();

            }

        }
    }
}
