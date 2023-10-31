using System;

namespace Unidad3P17 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("¡Bienvenido!");

            char opcion;
            do
            {
                Console.Write("Para salir, ingrese 'n': ");
                opcion = Console.ReadKey().KeyChar;
                Console.WriteLine(); // Salto de línea después de la entrada del usuario

            } while (char.ToLower(opcion) != 'n');

            Console.WriteLine("Gracias por usar el programa. ¡Hasta luego!");
        }
    }
}
