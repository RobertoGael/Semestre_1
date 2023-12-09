using System;

namespace U5P4 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int numero = 16;

            if (EsPrimo(numero))
            {
                Console.WriteLine(numero + " es un número primo.");
            }
            else
            {
                Console.WriteLine(numero + " no es un número primo.");
            }
        }
        static bool EsPrimo(int numero)
        {
            if (numero <= 1)
            {
                return false;
            }
            for (int i = 2; i <= Math.Sqrt(numero); i++)
            {
                if (numero % i == 0)
                {
                    return false;
                }
            }
            return true;
        }
    }
}
