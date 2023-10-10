/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa5;
import java.util.Scanner;
/**
 *
 * @author 52444
 */
public class Programa5 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int L1, L2, L3, perimetro, área, b, h;
            System.out.println("Dame el valor del Lado 1");
            L1 = sc.nextInt();
            System.out.println("Dame el valor del Lado 2");
            L2 = sc.nextInt();
            System.out.println("Dame el valor del lado 3");
            L3 = sc.nextInt();
            perimetro = L1 + L2 + L3;
            System.out.println("El perimetro es : "+ perimetro);
            
            System.out.println("Dame el valor de la Base");
            b = sc.nextInt();
            System.out.println("Dame el valor de la altura");
            h = sc.nextInt();
            área = (b * h) / 2;
            System.out.println("El área es : "+ área);
    }
}
