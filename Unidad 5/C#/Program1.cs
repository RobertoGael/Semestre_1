using System;

namespace U5P1 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("La suma es " + suma(14, 8));
            Console.WriteLine("La resta es " + resta(16, 8));
            Console.WriteLine("La multiplicacion es " + multi(7, 8));
            Console.WriteLine("La division es " + div(13, 8));
        }
        public static int suma(int a, int b)
        {
            int s = a + b;
            return s;
        }
        public static int resta(int a, int b)
        {
            int r = a - b;
            return r;
        }
        public static int multi(int a, int b)
        {
            int m = a * b;
            return m;
        }
        public static int div(int a, int b)
        {
            int d = a / b;
            return d;
        }
    }
}
