﻿using System;

namespace Unidad4P11 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[,] calf = { { 5, 7, 9 }, { 6, 8, 7 }, { 10, 3, 1 } };

            Console.Write(calf[0, 0] + ",");
            Console.Write(calf[0, 1] + ",");
            Console.WriteLine(calf[0, 2] + ",");

            Console.Write(calf[1, 0] + ",");
            Console.Write(calf[1, 1] + ",");
            Console.WriteLine(calf[1, 2] + ",");

            Console.Write(calf[2, 0] + ",");
            Console.Write(calf[2, 1] + ",");
            Console.WriteLine(calf[2, 2] + ",");
        }
    }
}
