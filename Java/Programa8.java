/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa8;
import java.util.Scanner;
/**
 *
 * @author 52444
 */
public class Programa8 {

    public static void main(String[] args) {
        Scanner it= new Scanner(System.in);
         double p1, p2, p3, sub, t, ivaT;
        final double iva=0.16;
        
        System.out.println("¿Cual es el precio que tiene el 1er producto? ");
        p1 = it.nextDouble();
        System.out.println("¿Cual es el precio que tiene el 2do producto? ");
        p2 = it.nextDouble();
        System.out.println("¿Cual es el precio que tiene el 3er producto? ");
        p3 = it.nextDouble();
        
        t = p1 + p2 +p3;
        ivaT = t * iva;
        sub = t - ivaT;
        System.out.println("El toal es: " + t);
        System.out.println("El subtotal es: " + sub);
        System.out.println("El IVA es: " + ivaT);
    }
}
