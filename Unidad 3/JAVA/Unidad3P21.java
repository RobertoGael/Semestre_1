/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad3p21;
import java.util.Scanner;
/**
 *
 * @author 52444
 */
public class Unidad3P21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de números
        System.out.print("Ingrese la cantidad de números naturales positivos: ");
        int cantidadNumeros = scanner.nextInt();

        // Validar que la cantidad de números sea positiva
        while (cantidadNumeros <= 0) {
            System.out.println("Por favor, ingrese un número positivo.");
            System.out.print("Ingrese la cantidad de números naturales positivos: ");
            cantidadNumeros = scanner.nextInt();
        }

        // Inicializar variables
        int contador = 0;

        // Utilizar do-while para calcular e imprimir el cubo de los números
        do {
            System.out.print("Ingrese un número natural positivo: ");
            int numero = scanner.nextInt();

            // Validar que el número sea positivo
            while (numero <= 0) {
                System.out.println("Por favor, ingrese un número natural positivo.");
                System.out.print("Ingrese un número natural positivo: ");
                numero = scanner.nextInt();
            }

            // Calcular e imprimir el cubo del número
            int cubo = numero * numero * numero;
            System.out.println("El cubo de " + numero + " es: " + cubo);

            contador++;
        } while (contador < cantidadNumeros);
    }
}
