package exercise07;

import java.util.Scanner;

public class Sinusberechnung
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sine of: ");
        double x = scanner.nextDouble();
        scanner.close();

        System.out.printf("sin(%.2f) = %f\n", x, new Sinusberechnung().sin(x));
    }

    public double sin(double x)
    {
        double numerator = x;
        double denominator = 1.0;
        double sum = numerator / denominator;
        double summand = 1.0;
        for (int i = 2; summand > 1E-15 || summand < -1E-15; i = i + 2)
        {
            numerator = numerator * x * x * (-1);
            denominator = denominator * i * (i + 1);
            summand = numerator / denominator;
            sum = sum + summand;
        }
        return sum;
    }
}