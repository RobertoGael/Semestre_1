/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa2;
import java.util.Scanner;
/**
 *
 * @author 52444
 */
public class Programa2 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b, suma;
        System.out.println("Escribe un numero A: ");
        a= sc.nextInt();
        System.out.println("Escribe un numero B: ");
        b= sc.nextInt();
        suma=a+b;
        System.out.println("Tu resultado es: "+suma);
    }
}
