/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad3p10;
import java.util.Scanner;
/**
 *
 * @author 52444
 */
public class Unidad3P10 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            double hrtrab, hrext, pago, sueldosem = 0;
            System.out.println("¿Cuantas horas trabajaste?");
            hrtrab = sc.nextDouble();
            System.out.println("¿Cuanto es el pago por hora?");
            pago = sc.nextDouble();

            if (hrtrab <= 40)
            {
                sueldosem = hrtrab * pago;
                System.out.println("Recibiras un total de $" + sueldosem);
            }
            else
            {
                hrext = hrtrab - 40;
                sueldosem = 40 * pago + hrext * (pago * 2);
                System.out.println("Por trabajar " + hrext + " horas extra, usted recibe un total de $" + sueldosem);
            }
    }
}
