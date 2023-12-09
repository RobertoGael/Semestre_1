/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u5p10;
import java.util.Random;
/**
 *
 * @author 52444
 */
public class U5P10 {

    public static void main(String[] args) {
        int longitud = 8;
        String contraseña = aleatorio(longitud); 
        System.out.println("pasword: ,"+contraseña);
    }
    public static String aleatorio(int longitud){
        String caracteres = "ABCDEFghijkl0123456789*-_.";
        Random random = new Random();
        StringBuilder cadena = new StringBuilder(longitud);
        for (int i = 0; i<longitud; i++){
           
            int indiceCaracter = random.nextInt(caracteres.length());
            cadena.append(caracteres.charAt(indiceCaracter));
        }           
    return cadena.toString();
    }
}
