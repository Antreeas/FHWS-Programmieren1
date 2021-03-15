package exercise06;

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Factorial of: ");
        int number = scanner.nextInt();
        System.out.printf("Factorial: %d", factorial(number));
        scanner.close();
    }

    public static int factorial(int number)
    {
        int faculty = 1;
        for (; number > 0; number--)
        {
            faculty = faculty * number;
        }
        return faculty;
    }
}