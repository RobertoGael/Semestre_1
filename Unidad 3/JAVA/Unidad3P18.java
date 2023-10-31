/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad3p18;

/**
 *
 * @author 52444
 */
public class Unidad3P18 {

    public static void main(String[] args) {
        // Salario inicial
        double salarioInicial = 1500.0;
        // Tasa de incremento anual
        double tasaIncremento = 0.10;
        // Número de años
        int numeroDeAños = 6;

        // Imprimir el salario al cabo de 6 años
        double salarioFinal = calcularSalarioFinal(salarioInicial, tasaIncremento, numeroDeAños);
        System.out.println("El salario al cabo de " + numeroDeAños + " años es: $" + salarioFinal);

        // Imprimir el salario recibido en cada uno de los 6 años
        System.out.println("\nSalario recibido en cada año:");
        for (int i = 1; i <= numeroDeAños; i++) {
            double salarioAnual = calcularSalarioAnual(salarioInicial, tasaIncremento, i);
            System.out.println("Año " + i + ": $" + salarioAnual);
        }
    }

    // Método para calcular el salario al cabo de ciertos años
    static double calcularSalarioFinal(double salarioInicial, double tasaIncremento, int numeroDeAños) {
        double salario = salarioInicial;

        for (int i = 0; i < numeroDeAños; i++) {
            salario += salario * tasaIncremento; // Incremento anual
        }

        return salario;
    }

    // Método para calcular el salario en un año específico
    static double calcularSalarioAnual(double salarioInicial, double tasaIncremento, int año) {
        double salario = salarioInicial;

        for (int i = 0; i < año; i++) {
            salario += salario * tasaIncremento; // Incremento anual
        }

        return salario;
    }
}
