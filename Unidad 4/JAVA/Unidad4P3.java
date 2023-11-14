/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad4p3;
import java.util.Scanner;
/**
 *
 * @author 52444
 */
public class Unidad4P3 {

    public static void main(String[] args) {
         double f = 0, k = 0;
        int temp;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa las temperaturas a procesar");
        temp = scanner.nextInt();

        int[] cent = new int[temp];

        for (int c = 0; c < cent.length; c++) {
            System.out.println("Escribe la temperatura en índice " + c + ": ");
            cent[c] = scanner.nextInt();
        }

        for (int c = 0; c < cent.length; c++) {
            f = (cent[c] * 9 / 5) + 32;
            System.out.println("Los grados Fahrenheit para la temperatura en índice " + c + " son " + f);

            k = cent[c] + 273.15;
            System.out.println("Los grados Kelvin para la temperatura en índice " + c + " son " + k);
        }
    }
}
