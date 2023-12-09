using System;

namespace U5P8 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int numero_Dados = 2;
            int resultado = Lanzar_Dados(numero_Dados);

            Console.WriteLine("Resultado del lanzamiento: " + resultado);
        }

        static int Lanzar_Dados(int numero_Dados)
        {
            Random random = new Random();
            int resultado = 0;

            for (int i = 0; i < numero_Dados; i++)
            {
                int valor_Dado = random.Next(1, 7);
                Console.WriteLine($"Dado {i + 1}: {valor_Dado}");

                resultado += valor_Dado;
            }

            return resultado;
        }
    }
}
