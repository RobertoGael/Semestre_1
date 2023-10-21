using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double p1, p2, p3, Total;
            Console.WriteLine("¿Qué precio tiene el 1er producto?");
            p1 = double.Parse(Console.ReadLine());
            Console.WriteLine("¿Qué precio tiene el 2do producto?");
            p2 = double.Parse(Console.ReadLine());
            Console.WriteLine("¿Qué precio tiene el 3er producto?");
            p3 = double.Parse(Console.ReadLine());

            Total = p1 + p2 + p3;

            if (Total >= 1500)
            {
                Total = Total - (Total * 0.3);
                Console.WriteLine("El total es " + Total);
            }
            else if (Total < 1500 && Total >= 1000)
            {
                Total = Total - (Total * 0.2);
                Console.WriteLine("El total es " + Total);
            }
            else if (Total < 1000 && Total >= 700)
            {
                Total = Total - (Total * 0.1);
                Console.WriteLine("El total es " + Total);
            }
            else
            {
                Console.WriteLine("El total es " + Total);
            }
        }
    }
}