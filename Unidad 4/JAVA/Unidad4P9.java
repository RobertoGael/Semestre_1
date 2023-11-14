/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad4p9;
import java.util.Scanner;
/**
 *
 * @author 52444
 */
public class Unidad4P9 {

    public static void main(String[] args) {
         String[] nombres = { "Roberto", "Alejandro", "Evelyn", "Carlos" };
        String[] apellidos = { "Ochoa", "Ortiz", "Cervantes", "Gomez" };

        String[] nombresCompletos = nombresApellidos(nombres, apellidos);

        System.out.println("Nombres completos:");
        imprimirArreglo(nombresCompletos);
    }

    static String[] nombresApellidos(String[] nombres, String[] apellidos) {
        String[] nombresCompletos = new String[nombres.length];

        for (int i = 0; i < nombres.length; i++) {
            nombresCompletos[i] = nombres[i] + " " + apellidos[i];
        }

        return nombresCompletos;
    }

    static void imprimirArreglo(String[] arreglo) {
        for (String elemento : arreglo) {
            System.out.println(elemento);
        }
    }
}
