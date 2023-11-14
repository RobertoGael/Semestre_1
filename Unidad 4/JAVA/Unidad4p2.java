/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad4p2;
import java.util.Scanner;
/**
 *
 * @author 52444
 */
public class Unidad4p2 {

    public static void main(String[] args) {
         int sum = 0, prom = 0, tam;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa las calificaciones a procesar");
        tam = sc.nextInt();

        int[] calf = new int[tam];

        for (int c = 0; c < calf.length; c++) {
            System.out.println("Escribe calificación en índice " + c + ": ");
            calf[c] = sc.nextInt();

            sum = sum + calf[c];
        }

        prom = sum / tam;

        System.out.println("Tu promedio es " + prom);
    }
}
