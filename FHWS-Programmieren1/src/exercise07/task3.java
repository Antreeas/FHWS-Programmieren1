package exercise07;

import java.util.Arrays;
import java.util.Scanner;

public class task3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantity of entries: ");
        int entryQuantity = sc.nextInt();
        if (entryQuantity <= 0)
        {
            System.out.println("Error!");
            System.exit(0);
        }
        double[] entry = new double[entryQuantity];
        for (int i = 0; i < entryQuantity; i++)
        {
            System.out.printf("%d. Entry: \t", (i + 1));
            entry[i] = sc.nextDouble();
        }
        sc.close();

        Arrays.sort(entry);
        System.out.printf("Smallest Entry: %14f\n", entry[0]);
        System.out.printf("Largest Entry: %15f\n", entry[entryQuantity - 1]);
        System.out.printf("Arithmetic Mean: %13f\n", new task3().mean(entry));
        System.out.printf("Standard Deviation: %10f\n", new task4().deviation(entry));
    }

    public double mean(double[] array)
    {
        double sum = 0;
        for (double entry : array)
        {
            sum = sum + entry;
        }
        return (sum / array.length);
    }
}