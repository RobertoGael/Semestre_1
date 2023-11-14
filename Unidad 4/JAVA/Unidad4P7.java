/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad4p7;
import java.util.Arrays;
/**
 *
 * @author 52444
 */
public class Unidad4P7 {

    public static void main(String[] args) {
        double[] numeros = { 4, 1, 9, 1, 7, 3, 5, 9, 4, 6 };

        double media = calcularMedia(numeros);
        System.out.println("La media es: " + media);

        double mediana = calcularMediana(numeros);
        System.out.println("La mediana es: " + mediana);
    }

    static double calcularMedia(double[] array) {
        double suma = 0;

        for (double numero : array) {
            suma += numero;
        }

        return suma / array.length;
    }

    static double calcularMediana(double[] array) {
        Arrays.sort(array);

        int n = array.length;

        if (n % 2 == 0) {
            double elemento1 = array[(n / 2) - 1];
            double elemento2 = array[n / 2];
            return (elemento1 + elemento2) / 2;
        } else {
            return array[n / 2];
        }
    }
}
