using System;

namespace PROMEDIO // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //ALGORITMO 3
            int c1, c2, c3, c4, c5, c6, promedio;
            float Promedio;
            Console.WriteLine("Escribe calificacion 1: ");
            c1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe calificacion 2: ");
            c2 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe calificacion 3: ");
            c3 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe calificacion 4: ");
            c4 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe calificacion 5: ");
            c5 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe calificacion 6: ");
            c6 = Convert.ToInt32(Console.ReadLine());
            //PASO- CALCULAR PROMEDIO
            promedio = (c1 + c2 + c3 + c4 + c5 + c6) / 6;
            //PASO- IMPRIME EL RESULTADO
            Console.WriteLine("Tu promedio es: "+ promedio);
        }
    }
}
