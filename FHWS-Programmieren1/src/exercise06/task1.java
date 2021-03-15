package exercise06;

import java.util.Scanner;

public class task1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Interval: ");
        double intervall = scanner.nextDouble();
        scanner.close();

        double pi = 0;
        double width = 1.0 / intervall;
        for (int i = 0; i <= intervall; i++)
        {
            double height = Math.sqrt(1 - Math.pow(i * width, 2));
            pi = pi + height * width;
        }
        System.out.printf("Pi = %f\n", 4 * pi);
    }
}