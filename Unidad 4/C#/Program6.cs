using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n;

            Console.WriteLine("Ingrese los números a procesar");
            n = Convert.ToInt32(Console.ReadLine());

            int[] num = new int[n];

            for (int i = 0; i < num.Length; i++)
            {
                Console.WriteLine("Escribe un número en indice " + n + ": ");
                num[i] = Convert.ToInt32(Console.ReadLine());
            }
            Array.Sort(num);
            Console.WriteLine("El orden de los números ");
            foreach (int i in num)
            {
                Console.WriteLine(i);
            }
        }
    }
}
