/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa10;
import java.util.Scanner;
/**
 *
 * @author 52444
 */
public class Programa10 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int L,P,A,area;
        System.out.println("Dame el valor de uno de los lados ");
        L = sc.nextInt ();
        P = L * 6;
        System.out.println("Dame el valor de la apotema ");
        A = sc.nextInt ();
        area = (P * A) / 2;
        
        System.out.print("El área es igual a: " + area);
    }
}
