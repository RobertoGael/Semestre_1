using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int L1, L2, L3, perimetro, área, b, h;
            Console.WriteLine("Dame el valor del Lado 1");
            L1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Dame el valor del Lado 2");
            L2 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Dame el valor del lado 3");
            L3 = Convert.ToInt32(Console.ReadLine());
            perimetro = L1 + L2 + L3;
            Console.WriteLine("El perimetro es :" + perimetro);
            Console.WriteLine("Dame el valor de la Base");
            b = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Dame el valor de la altura");
            h = Convert.ToInt32(Console.ReadLine());
            área = (b * h) / 2;
            Console.WriteLine("El área es :" + área);
        }
    }
}
