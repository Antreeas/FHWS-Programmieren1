package exercise04;

public class task2
{
    public static void main(String[] args)
    {
        double series = 0;
        double summand = 1;

        System.out.printf("Series\tSummand\n");
        for (int k = 1; summand > Math.pow(10, -5); k++)
        {
            summand = 6.0 * (1.0 / Math.pow(k, 2));
            series += summand;
            System.out.printf("%6.2f\t%7.5f\n", series, summand);
        }
    }
}