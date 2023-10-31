using System;

namespace Unidad3P19 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Solicitar la cantidad de números (N)
            Console.Write("Ingrese la cantidad de números (N): ");
            int N = int.Parse(Console.ReadLine());

            // Contadores
            int cero = 0;
            int mayoresCero = 0;
            int menoresCero = 0;

            // Solicitar los N números y clasificarlos
            for (int i = 0; i < N; i++)
            {
                Console.Write($"Ingrese el número #{i + 1}: ");
                int numero = int.Parse(Console.ReadLine());

                if (numero == 0)
                {
                    cero++;
                }
                else if (numero > 0)
                {
                    mayoresCero++;
                }
                else
                {
                    menoresCero++;
                }
            }

            // Mostrar resultados
            Console.WriteLine("\nResultados:");
            Console.WriteLine($"Cantidad de números iguales a cero: {cero}");
            Console.WriteLine($"Cantidad de números mayores a cero: {mayoresCero}");
            Console.WriteLine($"Cantidad de números menores a cero: {menoresCero}");
        }
    }
}
