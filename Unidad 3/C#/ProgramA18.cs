using System;

namespace Unidad3P18 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Salario inicial
            double salarioInicial = 1500.0;
            // Tasa de incremento anual
            double tasaIncremento = 0.10;
            // Número de años
            int numeroDeAños = 6;

            // Imprimir el salario al cabo de 6 años
            double salarioFinal = CalcularSalarioFinal(salarioInicial, tasaIncremento, numeroDeAños);
            Console.WriteLine($"El salario al cabo de {numeroDeAños} años es: ${salarioFinal}");

            // Imprimir el salario recibido en cada uno de los 6 años
            Console.WriteLine("\nSalario recibido en cada año:");
            for (int i = 1; i <= numeroDeAños; i++)
            {
                double salarioAnual = CalcularSalarioAnual(salarioInicial, tasaIncremento, i);
                Console.WriteLine($"Año {i}: ${salarioAnual}");
            }
        }

        // Método para calcular el salario al cabo de ciertos años
        static double CalcularSalarioFinal(double salarioInicial, double tasaIncremento, int numeroDeAños)
        {
            double salario = salarioInicial;

            for (int i = 0; i < numeroDeAños; i++)
            {
                salario += salario * tasaIncremento; // Incremento anual
            }

            return salario;
        }

        // Método para calcular el salario en un año específico
        static double CalcularSalarioAnual(double salarioInicial, double tasaIncremento, int año)
        {
            double salario = salarioInicial;

            for (int i = 0; i < año; i++)
            {
                salario += salario * tasaIncremento; // Incremento anual
            }

            return salario;
        }
    }
}
