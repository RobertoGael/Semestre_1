/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidadp1;
import java.util.Scanner;

/**
 *
 * @author 52444
 */
public class UnidadP1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int edad;
        System.out.println("escribe tu edad ");
        edad =sc.nextInt();
        if (edad>=18)
        System.out.println("Eres mayor de edad.");
        else
        System.out.println("Eres menor de edad.");
    }
}
