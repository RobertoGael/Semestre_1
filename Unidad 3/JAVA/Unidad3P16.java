/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad3p16;
import java.util.Scanner;
/**
 *
 * @author 52444
 */
public class Unidad3P16 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int c=1, horas, pago, sueldo;
        while (c<20){
        System.out.println("Captura las horas trabajadas: ");
        horas= sc.nextInt();
        System.out.println("Captura el pago por hora: ");
        pago= sc.nextInt();
        sueldo= horas*pago;
        System.out.println("Tu sueldo es: "+sueldo);
        c++;
        }
    }
}
