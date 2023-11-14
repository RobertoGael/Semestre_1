using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double f = 0, k = 0;
            int temp;
            Console.WriteLine("Ingresa las temperaturas procesar");
            temp = Convert.ToInt32(Console.ReadLine());

            int[] cent = new int[temp];

            for (int c = 0; c < cent.Length; c++)
            {
                Console.WriteLine("Escribe la temperatura en indice " + c + ": ");
                cent[c] = Convert.ToInt32(Console.ReadLine());

                f = (cent[c] * 9 / 5) + 32;

                Console.WriteLine("Los grados Farenheit son " + f);

                k = cent[c] + 273.15;

                Console.WriteLine("Los grados Kelvin son " + k);
            }
        }
    }
}
