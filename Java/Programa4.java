/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa4;
import java.util.Scanner;
/**
 *
 * @author 52444
 */
public class Programa4 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int Y,A,suma;
        System.out.println("Asigna el valor de Y: ");
        Y= sc.nextInt();
        System.out.println("Asigna el valor de A: ");
        A= sc.nextInt();
        //CALCULA LA FORMULA
        suma=Y+A+3;
        //IMPRIME EL RESULTADO DE LA FORMULA
        System.out.println("Tu resultado de X es: "+ suma);
    }
}
