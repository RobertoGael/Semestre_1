using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int e;
            Console.WriteLine("¿Introduce tu edad");
            e = Convert.ToInt32(Console.ReadLine());
            if (e >= 18)
                Console.WriteLine("Eres mayor de edad");
            if (e < 18)
                Console.WriteLine("Eres menor de edad");
        }
    }
}
