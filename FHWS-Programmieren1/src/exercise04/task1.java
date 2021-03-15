package exercise04;

import java.util.Scanner;

public class task1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Duration: ");
        int duration = scanner.nextInt();
        System.out.print("Interval: ");
        int interval = scanner.nextInt();
        scanner.close();

        System.out.printf("Elapsed Time\tCovered Distance\n");
        for (int i = 1; i <= duration; i++)
        {
            if (i % interval == 1 || interval == 1)
            {
                double s = 0.5 * 9.80665 * Math.pow(i, 2);
                System.out.printf("%10d s\t%14.2f m \n", i, s);
            }
        }
    }
}