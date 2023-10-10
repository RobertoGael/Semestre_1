/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa7;
import java.util.Scanner;
/**
 *
 * @author 52444
 */
public class Programa7 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
          int M, P;
            System.out.println("¿Cuantos metros deseas convertir? ");
            M = sc.nextInt();
            P = (int)(M * (3.28 / 1));
            System.out.println( M +" Metros convertidos a pies es igual a : "+ P);
    }
}
