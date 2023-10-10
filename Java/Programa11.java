/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa11;
import java.util.Scanner;
/**
 *
 * @author 52444
 */
public class Programa11 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         int e;
            System.out.println("¿Introduce tu edad");
            e = sc.nextInt();
            if (e >= 18)
            System.out.println("Eres mayor de edad");
            if (e < 18)
            System.out.println("Eres menor de edad");
    }
}
