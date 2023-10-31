using System;

namespace Unidad3P12 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int c, total, num;
            Console.WriteLine("Escribe el total de numeros a procesar: ");
            total = Convert.ToInt32(Console.ReadLine());
            for (c = 1; c <= total; c++)
            {
                Console.WriteLine("Escribe el numero: ");
                num = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Residuo: " + num % 2);
                if (num % 2 == 0)
                    Console.WriteLine("PAR");
                else
                    Console.WriteLine("IMPAR");
            }
        }
    }
}