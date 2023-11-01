/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad3p25;
import java.util.Scanner;
/**
 *
 * @author 52444
 */
public class Unidad3P25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operador;

        do {
            System.out.println("Ingrese un operador (+, -, *, /) o 'q' para salir:");
            operador = scanner.next().charAt(0);

            if (operador != 'q') {
                System.out.println("Ingrese el primer número:");
                double num1 = scanner.nextDouble();

                System.out.println("Ingrese el segundo número:");
                double num2 = scanner.nextDouble();

                double resultado = 0;

                switch (operador) {
                    case '+':
                        resultado = num1 + num2;
                        break;
                    case '-':
                        resultado = num1 - num2;
                        break;
                    case '*':
                        resultado = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            resultado = num1 / num2;
                        } else {
                            System.out.println("Error: No se puede dividir por cero.");
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Operador no válido. Inténtelo de nuevo.");
                        continue;
                }

                System.out.println("El resultado es: " + resultado);
            }

        } while (operador != 'q');

        System.out.println("¡Hasta luego!");
    }
}
