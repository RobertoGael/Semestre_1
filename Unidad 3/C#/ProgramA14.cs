﻿using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            for (int i = 2; i <= 200; i += 2)
            {
                Console.WriteLine(i);
            }
        }
    }
}
