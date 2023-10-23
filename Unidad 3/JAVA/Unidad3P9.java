/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad3p9;
import java.util.Scanner;
/**
 *
 * @author 52444
 */
public class Unidad3P9 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int he, hs, ht, costo = 0;

            System.out.println("Utiliza el formato de 24 horas.");
            System.out.println("¿Cual fue la hora de entrada? ");
            he = sc.nextInt();
            System.out.println("¿Cual fue la hora de salida? ");
            hs = sc.nextInt();

            ht = hs - he;

            if (ht <= 2)
            {
                costo = ht * 5;
                System.out.println("El costo esr: " + costo);
            }

            else if (ht < 5)
            {
                costo = ht * 4;
                System.out.println("El costo es: " + costo);
            }
    }
}
