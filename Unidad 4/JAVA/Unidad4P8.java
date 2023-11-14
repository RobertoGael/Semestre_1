/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad4p8;
import java.util.Arrays;
/**
 *
 * @author 52444
 */
public class Unidad4P8 {

    public static void main(String[] args) {
        int[] datos = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        var clasificacion = clasificarPI(datos);

        System.out.println("Elementos pares:");
        imprimirArreglo(clasificacion.pares);

        System.out.println("\nElementos impares:");
        imprimirArreglo(clasificacion.impares);
    }

    static Clasificacion clasificarPI(int[] arreglo) {
        int[] pares = Arrays.stream(arreglo).filter(elemento -> elemento % 2 == 0).toArray();
        int[] impares = Arrays.stream(arreglo).filter(elemento -> elemento % 2 != 0).toArray();

        return new Clasificacion(pares, impares);
    }

    static void imprimirArreglo(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}

class Clasificacion {
    int[] pares;
    int[] impares;

    Clasificacion(int[] pares, int[] impares) {
        this.pares = pares;
        this.impares = impares;
    }
}
