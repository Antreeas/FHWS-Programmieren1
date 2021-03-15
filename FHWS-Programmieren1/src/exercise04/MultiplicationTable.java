package exercise04;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        for (int a = 1, b = 1; a <= 10 && b <= 10; b++)
        {
            System.out.printf("%2d x %2d = %3d \n", a, b, a * b);
            if (b == 10)
            {
                a++;
                b = 0;
            }
        }
    }
}