package exercise06;

public class task4
{
    public static void main(String[] args)
    {
        triangle(5);
    }

    public static void triangle(int maxLines)
    {
        for (int currentLine = 1; currentLine <= maxLines; currentLine++)
        {
            for (int i = (maxLines - currentLine); i > 0; i--)
            {
                System.out.print(" ");
            }
            for (int i = 1; i <= currentLine; i++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}