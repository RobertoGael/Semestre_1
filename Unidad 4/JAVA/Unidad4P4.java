/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad4p4;
import java.util.Scanner;
/**
 *
 * @author 52444
 */
public class Unidad4P4 {

    public static void main(String[] args) {
         int n = 0, num;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa los números a procesar");
        num = scanner.nextInt();

        int[] neg = new int[num];

        for (int ne = 0; ne < neg.length; ne++) {
            System.out.println("Escribe un número en índice " + ne + ": ");
            neg[ne] = scanner.nextInt();

            if (neg[ne] < 0) {
                n++;
            }
        }

        System.out.println("Hay un total de " + n + " números negativos.");
    }
}
