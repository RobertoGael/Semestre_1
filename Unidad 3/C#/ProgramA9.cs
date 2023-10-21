using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int he, hs, ht;
            double costo = 0;

            Console.WriteLine("Utiliza el formato de 24 horas.");
            Console.WriteLine("¿Cual fue la hora de entrada? ");
            he = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("¿Cual fue la hora de salida? ");
            hs = Convert.ToInt32(Console.ReadLine());

            ht = hs - he;

            if (ht <= 2)
            {
                costo = ht * 5;
                Console.WriteLine("El costo esr: " + costo);
            }

            else if (ht <= 5)
            {
                costo = ht * 4;
                Console.WriteLine("El costo es: " + costo);
            }
        }
    }
}
