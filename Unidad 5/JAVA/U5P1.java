/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u5p1;

/**
 *
 * @author 52444
 */
public class U5P1 {

    public static void main(String[] args) {
    System.out.println ("La suma es " + suma (14, 8));
    System.out.println ("La resta es " + resta (16, 8));
    System.out.println ("La multiplicacion es " + multi (7, 8));
    System.out.println ("La division es " + div (13, 8));
  }
  public static int suma (int a, int b)
  {
    int s = a + b;
    return s;
  }
  public static int resta (int a, int b)
  {
    int r = a - b;
    return r;
  }
  public static int multi (int a, int b)
  {
    int m = a * b;
    return m;
  }
  public static int div (int a, int b)
  {
    int d = a / b;
    return d;
    }
}
