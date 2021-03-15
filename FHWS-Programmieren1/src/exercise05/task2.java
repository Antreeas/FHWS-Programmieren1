package exercise05;

import java.util.Scanner;

public class task2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        new task2().checkInput(scanner);
        scanner.close();
    }

    public void checkInput(Scanner scanner)
    {
        while (true)
        {
            System.out.print("Your Number: ");
            int number = scanner.nextInt();
            if (number >= 0 && number <= 1000000)
            {
                System.out.printf("Product of digits of %d is %d\n", number, multiplicativeDigitalRoot(number));
                break;
            } else
            {
                System.out.println("Error - Invalid Number.");
            }
        }
    }

    public int multiplicativeDigitalRoot(int number)
    {
        int product = 1;
        while (number != 0)
        {
            product = product * (number % 10);
            number = number / 10;
        }
        return product;
    }
}