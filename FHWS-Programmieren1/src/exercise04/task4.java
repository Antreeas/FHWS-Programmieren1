package exercise04;

import java.util.Scanner;

public class task4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your Number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (new task4().isPrime(number))
        {
            System.out.println("This is a prime number.");
        } else
        {
            System.out.println("This is not a prime number.");
        }
    }

    public boolean isPrime(int number)
    {
        boolean prime = true;
        if (number < 2)
        {
            prime = false;
        } else if (number == 2)
        // number 2 is a prime
        {
        } else
        {
            for (int i = 2; i <= Math.sqrt(number); i++)
            {
                if (number % i == 0)
                {
                    prime = false;
                }
            }
        }
        return prime;
    }
}