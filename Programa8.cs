using System;

namespace P_OCHO // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int p1, p2, p3, sub, t, iva;
            Console.WriteLine("¿Cual es el precio que tiene el 1er producto?");
            p1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("¿Cual es el precio que tiene el 2do producto?");
            p2 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("¿Cual es el precio que tiene el 3er producto?");
            p3 = Convert.ToInt32(Console.ReadLine());

            sub = (int)((int)(p1 / 1.16) + (p2 / 1.16) + (p3 / 1.16));
            Console.WriteLine("El subtotal es :" + sub);

            t = p1 + p2 + p3;
            Console.WriteLine("El total es :" + t);

            iva = t - sub;
            Console.WriteLine("El IVA es :" + iva);
        }
    }
}
