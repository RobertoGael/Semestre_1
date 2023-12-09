using System;

namespace U5P7 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingresa el subtotal de la factura:");
            double subtotal = double.Parse(Console.ReadLine());

            double iva = Calcular_IVA(subtotal);
            double total = Calcular_Total(subtotal, iva);

            Console.WriteLine($"Subtotal: ${subtotal}");
            Console.WriteLine($"IVA (16%): ${iva}");
            Console.WriteLine($"Total: ${total}");
        }

        static double Calcular_IVA(double subtotal)
        {
            double porcentaje_IVA = 0.16;
            return subtotal * porcentaje_IVA;
        }

        static double Calcular_Total(double subtotal, double iva)
        {
            return subtotal + iva;
        }
    }
}
