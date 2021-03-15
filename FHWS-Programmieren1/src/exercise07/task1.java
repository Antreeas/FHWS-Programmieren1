package exercise07;

import java.util.Scanner;

public class task1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Base: ");
        double base = scanner.nextDouble();
        System.out.print("Exponent: ");
        int exponent = scanner.nextInt();
        scanner.close();

        System.out.printf("Power : %f\n", new task1().pow(base, exponent));
    }

    public double pow(double base, int exponent)
    {
        return (exponent == 0) ? 1 : base * pow(base, (exponent - 1));
    }
}