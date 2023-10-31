/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad3p19;
import java.util.Scanner;
/**
 *
 * @author 52444
 */
public class Unidad3P19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de números (N)
        System.out.print("Ingrese la cantidad de números (N): ");
        int N = scanner.nextInt();

        // Contadores
        int cero = 0;
        int mayoresCero = 0;
        int menoresCero = 0;

        // Solicitar los N números y clasificarlos
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                cero++;
            } else if (numero > 0) {
                mayoresCero++;
            } else {
                menoresCero++;
            }
        }

        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Cantidad de números iguales a cero: " + cero);
        System.out.println("Cantidad de números mayores a cero: " + mayoresCero);
        System.out.println("Cantidad de números menores a cero: " + menoresCero);

    }
}
