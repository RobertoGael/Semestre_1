using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int N1, N2;
            Console.WriteLine("Ingresa el primer número: ");
            N1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Ingresa el segundo número: ");
            N2 = Convert.ToInt32(Console.ReadLine());

            if (N1 > N2)
                Console.WriteLine(N1 + " es mayor que " + N2);
            else
                Console.WriteLine(N1 + " es menor que " + N2);
        }
    }
}
