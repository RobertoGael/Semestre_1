/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad3p20;

/**
 *
 * @author 52444
 */
public class Unidad3P20 {

    public static void main(String[] args) {
         int diasEnUnAño = 365;

        // Inicializar variables
        double ahorroDiario = 3.0; // Ahorro inicial el primer día
        double ahorroAnual = 0.0;
        int dia = 1;

        // Utilizar do-while para calcular el ahorro diario y anual
        do {
            ahorroAnual += ahorroDiario; // Sumar al ahorro anual
            System.out.println("Día " + dia + ": Ahorro diario = $" + ahorroDiario);

            // Actualizar el ahorro diario (triplicar el valor)
            ahorroDiario *= 3;

            dia++;
        } while (dia <= diasEnUnAño);

        // Mostrar el ahorro anual
        System.out.println("\nAhorro anual: $" + ahorroAnual);
    }
}
