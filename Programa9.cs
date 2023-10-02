using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int a, b, s, r, m, d;
            Console.WriteLine("Dame el primer valor");
            a = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Dame el segundo valor");
            b = Convert.ToInt32(Console.ReadLine());

            s = a + b;
            Console.WriteLine("La suma es igual a :" + s);
            r = a - b;
            Console.WriteLine("La resta es igual a :" + r);
            m = a * b;
            Console.WriteLine("La multiplicación es igual a :" + m);
            d = a / b;
            Console.WriteLine("La división es igual a :" + d);
        }
    }
}
