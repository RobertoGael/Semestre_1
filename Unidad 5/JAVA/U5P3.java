/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u5p3;
import java.util.Scanner;
/**
 *
 * @author 52444
 */
public class U5P3 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
            System.out.println("Elige el numero de conversion a realizar");
            System.out.println("1 Temperatura ´C´ a ´F´");
            System.out.println("2 Temperatura ´F´ a ´K´");
            System.out.println("3 Medida de pulgadas a metros");
            System.out.println("4 Tiempo de horas a segundos");

            int op= sc.nextInt();

            switch(op)
            {
                case 1:
                    double c;
                    System.out.println("op1");
                    System.out.println("Ingrese la temperatura en celcius: ");
                    c = sc.nextInt();
                    System.out.println("Resultado = "  + converCtoF(c));
                    break;
                case 2:
                    System.out.println("op2");
                    System.out.println("Resultado = " + converFtoK());
                    break;
                case 3:
                    System.out.println("op3");
                    System.out.println("Resultado = " + medPtoM());
                    break;
                case 4:
                    System.out.println("op4");
                    System.out.println("Resultado = " + converHtoS());
                    break;
            }

        }
        public static double converCtoF(double c)
        {
            double r = (c * 1.8) + 32;
            return r;
        }
        public static double converFtoK()
        {
            Scanner sc = new Scanner(System.in);
            double f, r;
            System.out.println("Ingrese la temperatura en farenheit: ");
            f = sc.nextInt();
            r = (f - 32)-(5/9) + 273.15;
            return r;
        }
        public static double medPtoM()
        {
            Scanner sc = new Scanner(System.in);
            double p, r;
            System.out.println("Ingrese la medidad en pulgadas: ");
            p = sc.nextInt();
            r = p * 39.37;
            return r;
        }
        public static double converHtoS() 
        {
            Scanner sc = new Scanner(System.in);
            double h;
            System.out.println("Ingrese las horas a convertir: ");
            h = sc.nextInt();
            return h * 3600;
    }
}
