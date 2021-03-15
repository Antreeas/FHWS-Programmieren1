package exercise06;

public class Rounding
{
    public static void main(String[] args)
    {
        double number = 3.14159265359;
        int decimals = 4;

        System.out.printf("Rounded to the next Integer: %d\n", new Rounding().approximation(number));
        System.out.printf("Rounded to %d decimal places: %f\n", decimals, new Rounding().significantFigures(number, decimals));
    }

    public int approximation(double number)
    {
        return (int) (number + 0.5);
    }

    public double significantFigures(double number, int decimals)
    {
        for (int i = 0; i < decimals; i++) // shift decimal point to right
        {
            number = number * 10;
        }
        number = approximation(number);
        for (int i = 0; i < decimals; i++) // shift decimal point back to left
        {
            number = number / 10.0;
        }
        return number;
    }
}