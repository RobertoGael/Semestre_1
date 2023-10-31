using System;

namespace Unidad3P21 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Solicitar la cantidad de números
            Console.Write("Ingrese la cantidad de números naturales positivos: ");
            int cantidadNumeros = int.Parse(Console.ReadLine());

            // Validar que la cantidad de números sea positiva
            while (cantidadNumeros <= 0)
            {
                Console.WriteLine("Por favor, ingrese un número positivo.");
                Console.Write("Ingrese la cantidad de números naturales positivos: ");
                cantidadNumeros = int.Parse(Console.ReadLine());
            }

            // Inicializar variables
            int contador = 0;

            // Utilizar do-while para calcular e imprimir el cubo de los números
            do
            {
                Console.Write("Ingrese un número natural positivo: ");
                int numero = int.Parse(Console.ReadLine());

                // Validar que el número sea positivo
                while (numero <= 0)
                {
                    Console.WriteLine("Por favor, ingrese un número natural positivo.");
                    Console.Write("Ingrese un número natural positivo: ");
                    numero = int.Parse(Console.ReadLine());
                }

                // Calcular e imprimir el cubo del número
                int cubo = numero * numero * numero;
                Console.WriteLine($"El cubo de {numero} es: {cubo}");

                contador++;
            } while (contador < cantidadNumeros);
        }
    }
}
