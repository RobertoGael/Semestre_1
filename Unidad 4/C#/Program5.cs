using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int f;

            Console.WriteLine("Ingrese las frutas a procesar: ");
            f = Convert.ToInt32(Console.ReadLine());

            string[] frutas = new string[f];

            for (int i = 0; i < frutas.Length; i++)
            {
                Console.WriteLine("Escribe una fruta en indice " + (i + 1) + ": ");
                frutas[i] = Console.ReadLine();

            }
            foreach (string F in frutas)
            {
                Console.WriteLine(F);
            }
            for (int j = f - 1; j >= 0; j--)
            {
                Console.WriteLine(frutas[j]);
            }
        }
    }
}
