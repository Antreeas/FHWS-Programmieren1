package exercise05;

public class Temperature
{
    public static void main(String[] args)
    {
        System.out.println("Fahrenheit \t Celsius");
        for (int fahrenheit = 0; fahrenheit <= 300; fahrenheit++)
        {
            double celcius = (5.0 / 9) * (fahrenheit - 32);
            System.out.printf("%10d\t%8.2f\n", fahrenheit, celcius);
        }
    }
}