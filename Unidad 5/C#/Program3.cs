using System;

namespace U5P3 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Elige el numero de conversion a realizar");
            Console.WriteLine("1 Temperatura ´C´ a ´F´");
            Console.WriteLine("2 Temperatura ´F´ a ´K´");
            Console.WriteLine("3 Medida de pulgadas a metros");
            Console.WriteLine("4 Tiempo de horas a segundos");

            int op = Convert.ToInt32(Console.ReadLine());

            switch (op)
            {
                case 1:
                    double c;
                    Console.WriteLine("op1");
                    Console.WriteLine("Ingrese la temperatura en celcius: ");
                    c = Convert.ToInt32(Console.ReadLine());
                    Console.WriteLine("Resultado = " + converCtoF(c));
                    break;
                case 2:
                    Console.WriteLine("op2");
                    Console.WriteLine("Resultado = " + converFtoK());
                    break;
                case 3:
                    Console.WriteLine("op3");
                    Console.WriteLine("Resultado = " + medPtoM());
                    break;
                case 4:
                    Console.WriteLine("op4");
                    Console.WriteLine("Resultado = " + converHtoS());
                    break;
            }

        }
        public static double converCtoF(double c)
        {
            double r = (c * 1.8) + 32;
            return r;
        }
        public static double converFtoK()
        {
            double f, r;
            Console.WriteLine("Ingrese la temperatura en farenheit: ");
            f = Convert.ToInt32(Console.ReadLine());
            r = (f - 32) - (5 / 9) + 273.15;
            return r;
        }
        public static double medPtoM()
        {
            double p, r;
            Console.WriteLine("Ingrese la medidad en pulgadas: ");
            p = Convert.ToInt32(Console.ReadLine());
            r = p * 39.37;
            return r;
        }
        public static double converHtoS()
        {
            double h;
            Console.WriteLine("Ingrese las horas a convertir: ");
            h = Convert.ToInt32(Console.ReadLine());
            return h * 3600;
        }
    }
}
