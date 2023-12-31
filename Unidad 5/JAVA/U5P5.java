/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u5p5;
import java.util.Scanner;
/**
 *
 * @author 52444
 */
public class U5P5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase o palabra:");
        String entrada_Usuario = scanner.nextLine();

        int cantidad_Palabras = contar_Palabras(entrada_Usuario);

        System.out.println("Número de palabras: " + cantidad_Palabras);
    }

    public static int contar_Palabras(String cadena) {
        if (cadena == null || cadena.isEmpty()) {
            return 0;
        }

        String[] palabras = cadena.split("\\s+");

        return palabras.length;
    }
}
