using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string[] nombres = { "Roberto", "Alejandro", "Evelyn", "Carlos" };
            string[] apellidos = { "Ochoa", "Ortiz", "Cervantes", "Gomez" };

            string[] NombresCom = Nombres_Apellidos(nombres, apellidos);

            Console.WriteLine("Nombres completos:");
            Arreglo(NombresCom);
        }

        static string[] Nombres_Apellidos(string[] nombres, string[] apellidos)
        {
            string[] Nombres_Com = new string[nombres.Length];

            for (int i = 0; i < nombres.Length; i++)
            {
                Nombres_Com[i] = $"{nombres[i]} {apellidos[i]}";
            }

            return Nombres_Com;
        }


        static void Arreglo(string[] arreglo)
        {
            foreach (var elemento in arreglo)
            {
                Console.WriteLine(elemento);
            }
        }
    }
}
