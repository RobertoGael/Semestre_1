using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //ALGORITMO 4
            //DECLARAR VARIABLES
            int Y, A, suma;
            Console.WriteLine("Asigna el valor de Y");
            Y = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Asigna el valor de A");
            A = Convert.ToInt32(Console.ReadLine());
            //PASO- CALCULA LA FORMULA
            suma = Y + A + 3;
            //PASO- IMPRIME EL RESULTADO DE LA FORMULA
            Console.WriteLine("Tu resultado de X es: " + suma);
        }
    }
}
