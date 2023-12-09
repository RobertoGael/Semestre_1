/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u5p9;
import java.util.Scanner;
/**
 *
 * @author 52444
 */
public class U5P9 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el sueldo diario del trabajador:");
        double sueldo_Diario = scanner.nextDouble();

        System.out.println("Ingresa el tiempo laborado en meses:");
        int meses_Trabajados = scanner.nextInt();

        double finiquito = calcular_Finiquito(sueldo_Diario, meses_Trabajados);

        System.out.println("Finiquito del trabajador: $" + finiquito);
    }

    public static double calcular_SalarioBase(double sueldo_Diario, int meses_Trabajados) {
        return sueldo_Diario * 30 * meses_Trabajados;
    }

    public static double calcular_Prestaciones(double sueldo_Diario, int meses_Trabajados) {
        return sueldo_Diario * 0.0833 * 30 * meses_Trabajados;
    }
    
    public static double calcular_Finiquito(double sueldo_Diario, int meses_Trabajados) {
        double salario_Base = calcular_SalarioBase(sueldo_Diario, meses_Trabajados);
        double prestaciones = calcular_Prestaciones(sueldo_Diario, meses_Trabajados);

        return salario_Base + prestaciones;
    }
}
