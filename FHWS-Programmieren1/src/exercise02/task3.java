package exercise02;

public class task3
{
    public static void main(String[] args)
    {
        double p = 10;
        double q = 10;

        double x1 = (-p / 2) + Math.sqrt(Math.pow(p / 2, 2) - q);
        double x2 = (-p / 2) - Math.sqrt(Math.pow(p / 2, 2) - q);

        System.out.printf("x1 = %.2f\n", x1);
        System.out.printf("x2 = %.2f\n", x2);
    }
}
