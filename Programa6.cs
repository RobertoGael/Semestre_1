using System;

namespace P_CINCO // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int C, F;
            Console.WriteLine("Introduce el valor de los grados centigrados");
            C = Convert.ToInt32(Console.ReadLine());
            F = (C * 9 / 5) + 32;
            Console.WriteLine("Los grados fahrenheit son :" + F);
        }
    }
}
