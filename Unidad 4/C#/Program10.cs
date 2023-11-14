using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string[] paises = { "Canadá", "México", "Brazil", "Argentina" };

            double longitudPromedio = CalcularLongitud(paises);

            Console.WriteLine($"La longitud promedio de las palabras de los países es: {longitudPromedio:F2}");
        }

        static double CalcularLongitud(string[] arreglo)
        {
            int totalLetras = 0;
            int totalPalabras = 0;

            foreach (string pais in arreglo)
            {
                totalLetras += pais.Replace(" ", "").Length;
                totalPalabras += pais.Split(' ').Length;
            }

            double longitudPromedio = (double)totalLetras / totalPalabras;

            return longitudPromedio;
        }
    }
}
