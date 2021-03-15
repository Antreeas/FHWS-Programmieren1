package exercise03;

import java.util.Scanner;

public class task3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Character: ");
        int i = scanner.nextLine().charAt(0);
        scanner.close();

        boolean unidentified = true;
        if (i >= 0x41 && i <= 0x5a)
        {
            System.out.println("Capital");
            unidentified = false;
        }
        if (i >= 0x30 && i <= 0x39 || i >= 0x41 && i <= 0x46 || i >= 0x61 && i <= 0x66)
        {
            System.out.println("Hexadezimal");
            unidentified = false;
        }
        if (i == 0x30 || i == 0x31)
        {
            System.out.println("Binary");
            unidentified = false;
        }
        if (i >= 0x30 && i <= 0x38)
        {
            System.out.println("Octal");
            unidentified = false;
        }
        if (unidentified == true)
        {
            System.out.println("Unidentified");
        }
    }
}