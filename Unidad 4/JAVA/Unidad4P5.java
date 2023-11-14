/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad4p5;
import java.util.Scanner;
/**
 *
 * @author 52444
 */
public class Unidad4P5 {

    public static void main(String[] args) {
        int f;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de frutas a procesar: ");
        f = scanner.nextInt();

        String[] frutas = new String[f];

        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Escribe una fruta en índice " + (i + 1) + ": ");
            frutas[i] = scanner.next();
        }

        System.out.println("Frutas en orden original:");
        for (String F : frutas) {
            System.out.println(F);
        }

        System.out.println("Frutas en orden inverso:");
        for (int j = f - 1; j >= 0; j--) {
            System.out.println(frutas[j]);
        }
    }
}
