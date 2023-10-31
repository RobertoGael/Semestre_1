using System;

namespace Unidad3P16 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int c = 1, horas, pago, sueldo;
            while (c < 20)
            {
                Console.WriteLine("Captura las horas trabajadas: ");
                horas = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Captura el pago por hora: ");
                pago = Convert.ToInt32(Console.ReadLine());
                sueldo = horas * pago;
                Console.WriteLine("Tu sueldo es: " + sueldo);
                c++;
            }
        }
    }
}
