using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int C1, C2, C3, C4, C5, C6, P;
            Console.WriteLine("Escribe calificacion 1: ");
            C1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe calificacion 2: ");
            C2 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe calificacion 3: ");
            C3 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe calificacion 4: ");
            C4 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe calificacion 5: ");
            C5 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe calificacion 6: ");
            C6 = Convert.ToInt32(Console.ReadLine());
            P = (C1 + C2 + C3 + C4 + C5 + C6) / 6;
            if (P >= 70)
                Console.WriteLine("Usted esta Aprobado");
            else
                Console.WriteLine("Usted esta Reprobado");
        }
    }
}