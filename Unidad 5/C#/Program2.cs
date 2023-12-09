using System;

namespace U5P2 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double x, y;
            Console.WriteLine("Dame el valor para x: ");
            x = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Dame el valor para y: ");
            y = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Tu resultado de la ecuacion1 = " + ecuacion1(x, y));
            Console.WriteLine("Tu resultado de la ecuacion2 = " + ecuacion2(x, y));
        }

        public static double ecuacion1(double x, double y)

        {
            double r;
            r = Math.Pow(x, 2) + (2 * Math.Pow(y, 4));
            return r;
        }

        public static double ecuacion2(double x, double y)
        {
            double r;
            r = Math.Sqrt(Math.Pow(x, 4) + 5 * y);
            return r;
        }
    }
}
