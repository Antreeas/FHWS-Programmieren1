package exercise03;

import java.util.Scanner;

public class Modulo
{
    public static void main(String[] args)
    {
        int divisibleBy = 7;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number to check: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number % divisibleBy == 0)
        {
            System.out.printf("%d is divisible by %d.\n", number, divisibleBy);
        } else
        {
            System.out.printf("%d is not divisible by %d.\n", number, divisibleBy);
        }
    }
}

/*
	i	modulo	m = r
	+			+	+
	+			-	+
	-			+	-
	-			-	-
*/