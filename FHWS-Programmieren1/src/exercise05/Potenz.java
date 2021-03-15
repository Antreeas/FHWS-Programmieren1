package exercise05;

import java.util.Scanner;

public class Potenz
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Base: ");
        double base = scanner.nextDouble();
        System.out.print("Exponent: ");
        int exponent = scanner.nextInt();
        scanner.close();

        System.out.printf("Potenz: %f\n", new Potenz().pow(base, exponent));
    }

    public double pow(double base, int exponent)
    {
        double power = 1;
        if (exponent != 0)
        {
            for (int i = 0; i < ((exponent < 0) ? -exponent : exponent); i++)
            {
                power = power * base;
            }
            if (exponent < 0)
            {
                power = 1.0 / power;
            }
        }
        return power;
    }
}