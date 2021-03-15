package exercise07;

public class Standardabweichung
{
    public double deviation(double[] array)
    {
        double mean = new ArithmetischesMittel().mean(array);
        double sum = 0;
        for (double e : array)
        {
            sum = sum + Math.pow(e - mean, 2);
        }
        return Math.sqrt(sum / array.length);
    }
}