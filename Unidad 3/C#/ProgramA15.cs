using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int c = 1, suma = 0;
            while (c <= 20)
            {
                suma = suma + c;
                c++;
            }
            Console.WriteLine("Tu suma es: " + suma);
        }
    }
}
