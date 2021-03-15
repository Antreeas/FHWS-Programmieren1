package exercise10;

public class SubAutoManager
{
    public static void main(String[] args)
    {
        exercise09.Auto[] autos = new exercise09.Auto[3];
        autos[0] = new SubAuto("VW", 230, "weiß");
        autos[1] = new SubAuto("BMW", 430, "blau");
        autos[2] = new SubAuto("Mercedes", 500, "grau");

        int averagePrice = SubAuto.calculateRevenue(20000);
        System.out.println("The total revenue is " + averagePrice + "€.");
    }
}
