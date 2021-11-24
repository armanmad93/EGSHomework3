package com.company;

/*
 * @author Arman Karapetyan
 */

import static com.company.MyUtilClass.printAllElementInMatrix;

public class Main {

    public static void main(String[] args) {

        printAllElementInMatrix(new int[][]{
                {1, 2, 3, 9},
                {4, 5, 6},
                {7, 8}
        });
    }
}
