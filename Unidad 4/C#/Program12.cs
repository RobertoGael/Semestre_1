using System;

namespace Unidad4P12 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[,] num = { { 21, 5, 21, 5 }, { 25, 3, 18, 8 }, { 22, 1, 6, 17 } };

            int fila = num.GetLength(0);
            int col = num.GetLength(1);

            for (int i = 0; i < fila; i++)
            {
                for (int j = 0; j < col; j++)
                {
                    Console.Write(num[i, j] + " ");
                }
                Console.WriteLine();
            }

            /* int[,] num = { { 21, 5, 21 }, { 25, 3, 18 }, { 22, 1, 6 } };

            for (int i = 0; i <=2; i++)
            {
                for (int c = 0; c <=2; c++)
                {
                    Console.Write(num[i,c] + " ");
                }
                Console.WriteLine();
            }

            Console.Write(num[0, 0]);
            Console.Write(num[0, 1]);
            Console.Write(num[0, 2]);
            Console.WriteLine();
            Console.Write(num[1, 0]);
            Console.Write(num[1, 1]);
            Console.Write(num[1, 2]);
            Console.WriteLine();
            Console.Write(num[2, 0]);
            Console.Write(num[2, 1]);
            Console.Write(num[2, 2]);*/
        }
    }
}
