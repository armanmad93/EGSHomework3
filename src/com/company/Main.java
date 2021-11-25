package com.company;

/*
 * @author Arman Karapetyan
 */

import static com.company.MyUtilClass.*;

public class Main {

    public static void main(String[] args) {

        printAllElementInMatrix(new int[][]{
                {1, 2, 3, 9},
                {4, 5, 6},
                {7, 8}
        });

        printAllElementInMatrixVersion2(new int[][]{
                {1, 2, 3},
                {4, 5, 8},
                {5, 6, 7}
        });
    }
}
