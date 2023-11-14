using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /* int[] calif = new int[10] { 90, 83, 75, 62, 91, 80, 66, 90, 79, 87 };

           double sum = 0, prom = 0;

           for (int c = 0; c < 10; c++)
           {
               sum = sum + calif[c];
               prom = sum / 10;

           }
           Console.WriteLine("Tu promedio es " + prom); */


            int sum = 0, prom = 0, tam;
            Console.WriteLine("Ingresa las calificaciones a procesar");
            tam = Convert.ToInt32(Console.ReadLine());

            int[] calf = new int[tam];

            for (int c = 0; c < calf.Length; c++)
            {
                Console.WriteLine("Escribe calificación en indice " + c + ": ");
                calf[c] = Convert.ToInt32(Console.ReadLine());

                sum = sum + calf[c];
                prom = sum / 10;

            }

            Console.WriteLine("Tu promedio es " + prom);
        }
    }
}
