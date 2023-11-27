/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad4p12;

/**
 *
 * @author 52444
 */
public class Unidad4P12 {

    public static void main(String[] args) {
         int[][] num = {{21, 5, 21, 5}, {25, 3, 18, 8}, {22, 1, 6, 17}};

        int fila = num.length;
        int col = num[0].length;

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
