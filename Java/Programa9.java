/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa9;
import java.util.Scanner;
/**
 *
 * @author 52444
 */
public class Programa9 {

    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        int a,b,s,r,d,m;
        System.out.println("Dame el primer valor: ");
        a = sc.nextInt ();
        System.out.println("Dame el segundo valor: ");
        b = sc.nextInt ();
        
        s = a + b;
        System.out.println("La suma es igual a: " + s);
        r = a - b;
        System.out.println("La resta es igual a: " + r);
        m = a * b;
        System.out.println("La multiplicacion es igual a: " + m);
        d = a / b;
        System.out.println("La division es igual a: " + d);
    }
}
