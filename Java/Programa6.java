/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa6;
import java.util.Scanner;
/**
 *
 * @author 52444
 */
public class Programa6 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         int C, F;
            System.out.println("Introduce el valor de los grados centigrados");
            C = sc.nextInt();
            F = (C * 9 / 5) + 32;
            System.out.println("Los grados fahrenheit son :" + F);
    }
}
