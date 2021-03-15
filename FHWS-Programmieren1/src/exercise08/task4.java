package exercise08;

import java.util.Arrays;
import java.util.Scanner;

public class task4
{
    private static final String[] words = {"Hello", "World"};

    public static void main(String[] args)
    {
        char[] word = words[(int) (Math.random() * words.length)].toUpperCase().toCharArray();
        char[] dash = new char[word.length];
        Arrays.fill(dash, '_');

        Scanner scanner = new Scanner(System.in);
        for (int attempt = 1; attempt <= 15; attempt++)
        {
            System.out.printf("%d. Try: \t", attempt);
            for (char e : dash)
            {
                System.out.printf("%s ", e);
            }
            System.out.print("\n Letter: \t");
            char guess = Character.toUpperCase(scanner.nextLine().charAt(0));
            for (int i = 0; i < word.length; i++)
            {
                if (word[i] == guess)
                {
                    dash[i] = guess;
                }
            }
            if (Arrays.equals(dash, word))
            {
                break;
            }
        }
        if (Arrays.equals(dash, word))
        {
            System.out.println("Victory: " + String.valueOf(dash));
        } else
        {
            System.out.println("Defeat!");
        }
        scanner.close();
    }
}