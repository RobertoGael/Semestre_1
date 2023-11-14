/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad4p10;

/**
 *
 * @author 52444
 */
public class Unidad4P10 {

    public static void main(String[] args) {
         String[] paises = { "Canadá", "México", "Brazil", "Argentina" };

        double longitudPromedio = calcularLongitud(paises);

        System.out.printf("La longitud promedio de las palabras de los países es: %.2f%n", longitudPromedio);
    }

    static double calcularLongitud(String[] arreglo) {
        int totalLetras = 0;
        int totalPalabras = 0;

        for (String pais : arreglo) {
            totalLetras += pais.replace(" ", "").length();
            totalPalabras += pais.split(" ").length;
        }

        double longitudPromedio = (double) totalLetras / totalPalabras;

        return longitudPromedio;
    }
}
