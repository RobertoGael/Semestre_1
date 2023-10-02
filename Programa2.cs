using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Algoritmo2 
            //Inicio 
            //Declarar Variable
            int N1, N2, suma;
            Console.WriteLine("Introduce el primer numero");
            N1 = Int32.Parse(Console.ReadLine());
            Console.WriteLine("Introduce el segundo numero");
            N2 = Int32.Parse(Console.ReadLine());
            suma = N1 + N2;
            Console.WriteLine(suma);
        }
    }
}