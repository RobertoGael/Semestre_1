/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa3;
import java.util.Scanner;
/**
 *
 * @author 52444
 */
public class Programa3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int c1,c2,c3,c4,c5,c6,promedio;
        System.out.println("Escribe calificacion 1: ");
        c1= sc.nextInt();
        System.out.println("Escribe calificacion 2: ");
        c2= sc.nextInt();
        System.out.println("Escribe calificacion 3: ");
        c3= sc.nextInt();
        System.out.println("Escribe calificacion 4: ");
        c4= sc.nextInt();
        System.out.println("Escribe calificacion 5: ");
        c5= sc.nextInt();
        System.out.println("Escribe calificacion 6: ");
        c6= sc.nextInt();
        promedio=(c1+c2+c3+c4+c5+c6)/6;
        System.out.println("Tu promedio es: "+ promedio);
    }
}
