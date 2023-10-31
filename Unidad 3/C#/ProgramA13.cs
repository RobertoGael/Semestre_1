using System;

namespace Unidad3P13 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int positivos = 0, negativos = 0;
            for (int i = 0; i < 5; i++)
            {
                Console.WriteLine("Introduce el numero " + (i + 1) + ":");
                int numero = Convert.ToInt32(Console.ReadLine());

                if (numero > 0)
                {
                    positivos++;
                }
                else if (numero < 0)
                {
                    negativos++;
                }
            }
            Console.WriteLine("Cantidad de numeros positivos: " + positivos);
            Console.WriteLine("Cantidad de numeros negativos: " + negativos); ;
        }
    }
}