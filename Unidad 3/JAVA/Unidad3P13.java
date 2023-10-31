/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad3p13;
import java.util.Scanner;
/**
 *
 * @author 52444
 */
public class Unidad3P13 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int positivos=0, negativos=0;
        for (int i = 0; i < 5; i++){
        System.out.println("Introduce el numero "+ (i + 1) + ":");
        int numero =sc.nextInt();
    
        if(numero > 0){
            positivos++;
        } else if (numero < 0) {
            negativos++;
        }    
       }
          System.out.println("Cantidad de numeros positivos: " + positivos);
          System.out.println("Cantidad de numeros negativos: " + negativos);
    }
}
