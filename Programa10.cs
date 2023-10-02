using System;

namespace P_DIEZ // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int L, P, A, área;
            Console.WriteLine("Dame el valor de uno de los lados");
            L = Convert.ToInt32(Console.ReadLine());
            P = L * 6;
            Console.WriteLine("Dame el valor del apotema");
            A = Convert.ToInt32(Console.ReadLine());
            área = (P * A) / 2;
            Console.WriteLine("El área es igual a :" + área);
        }
    }
}
