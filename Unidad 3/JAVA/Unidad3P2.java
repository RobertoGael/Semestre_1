/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad3p2;
import java.util.Scanner;

/**
 *
 * @author 52444
 */
public class Unidad3P2 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int C1,C2,C3,C4,C5,C6,P;
        System.out.println("Escribe calificación 1 ");
        C1 =sc.nextInt();
        System.out.println("Escribe calificación 2 ");
        C2 =sc.nextInt();
        System.out.println("Escribe calificación 3 ");
        C3 =sc.nextInt();
        System.out.println("Escribe calificación 4 ");
        C4 =sc.nextInt();
        System.out.println("Escribe calificación 5 ");
        C5 =sc.nextInt();
        System.out.println("Escribe calificación 6 ");
        C6 =sc.nextInt();
        
        P=(C1+C2+C3+C4+C5+C6)/6;
        
        if (P>=70){
        System.out.println("Uste esta Aprobado"); 
        }
        else{
        System.out.println("Usted esta Reprobado");
        }
    }
}
