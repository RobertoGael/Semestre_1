using System;

namespace Unidad3P20 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int diasEnUnAño = 365;

            // Inicializar variables
            double ahorroDiario = 3.0; // Ahorro inicial el primer día
            double ahorroAnual = 0.0;
            int dia = 1;

            // Utilizar do-while para calcular el ahorro diario y anual
            do
            {
                ahorroAnual += ahorroDiario; // Sumar al ahorro anual
                Console.WriteLine($"Día {dia}: Ahorro diario = ${ahorroDiario}");

                // Actualizar el ahorro diario (triplicar el valor)
                ahorroDiario *= 3;

                dia++;
            } while (dia <= diasEnUnAño);

            // Mostrar el ahorro anual
            Console.WriteLine($"\nAhorro anual: ${ahorroAnual}");
        }
    }
}
