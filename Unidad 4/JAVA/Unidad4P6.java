/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad4p6;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author 52444
 */
public class Unidad4P6 {

    public static void main(String[] args) {
         int n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números a procesar: ");
        n = scanner.nextInt();

        int[] num = new int[n];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Escribe un número en índice " + i + ": ");
            num[i] = scanner.nextInt();
        }

        Arrays.sort(num);

        System.out.println("El orden de los números:");
        for (int i : num) {
            System.out.println(i);
        }
    }
}
