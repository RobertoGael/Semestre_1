/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad3p12;
import java.util.Scanner;
/**
 *
 * @author 52444
 */
public class Unidad3P12 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int c, total, num;
        System.out.println("Escribe el total de numeros a procesar: ");
        total= sc.nextInt();
        for (c=1; c<=total;c++){
            System.out.println("Escribe el numero: ");
            num= sc.nextInt();
            System.out.println("Residuo: "+num%2);
            if (num%2 == 0)
                System.out.println("PAR");
            else
                System.out.println("IMPAR");
        }
    }
}
