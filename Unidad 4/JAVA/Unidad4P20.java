/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad4p20;

/**
 *
 * @author 52444
 */
public class Unidad4P20 {

    public static void main(String[] args) {
        int num[][] = { {5,6} , {8,9} };
        int res [][] = new int [2][2];
        for (int f=0; f<2; f++) {
            for (int c=0; c<2; c++){
                res[f][c]=num[f][c] * num[f][c];
            }
        }
       for (int f=0; f<2; f++) {
           for (int c=0; c<2; c++) {
               System.out.print (res[f][c]+", ");
           }
           System.out.println();
       }
    }
}
