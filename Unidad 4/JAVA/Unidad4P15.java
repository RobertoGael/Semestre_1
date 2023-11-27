/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad4p15;
import java.util.Scanner;
/**
 *
 * @author 52444
 */
public class Unidad4P15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int filas = sc.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = sc.nextInt();

        double[][] matriz = new double[filas][columnas];

        System.out.println("Ingrese los elementos de la matriz:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Media de cada fila:");

        for (int i = 0; i < filas; i++) {
            double suma = 0;

            for (int j = 0; j < columnas; j++) {
                suma += matriz[i][j];
            }

            double media = suma / columnas;
            System.out.println("Fila " + (i + 1) + ": " + media);
        }
    }
}
