using System;

namespace P_SIETE // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int M, P;
            Console.WriteLine("¿Cuantos metros deseas convertir?");
            M = Convert.ToInt32(Console.ReadLine());
            P = (int)(M * (3.28 / 1));
            Console.WriteLine( M +"Metros convertidos a pies es igual a :"+ P);
        }
    }
}
