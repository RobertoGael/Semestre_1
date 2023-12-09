using System;

namespace U5P6 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese la longitud de la secuencia Fibonacci:");
            int longitud = int.Parse(Console.ReadLine());

            Console.WriteLine("Secuencia Fibonacci:");
            Imprimir_Fibonacci(longitud);
        }

        static void Imprimir_Fibonacci(int longitud)
        {
            int primer_Numero = 0;
            int segundo_Numero = 1;

            Console.Write(primer_Numero + " " + segundo_Numero + " ");

            for (int i = 2; i < longitud; i++)
            {
                int siguiente_Numero = primer_Numero + segundo_Numero;
                Console.Write(siguiente_Numero + " ");

                primer_Numero = segundo_Numero;
                segundo_Numero = siguiente_Numero;
            }
        }
    }
}
