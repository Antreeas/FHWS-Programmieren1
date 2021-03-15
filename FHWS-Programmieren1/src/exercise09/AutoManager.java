package exercise09;

public class AutoManager
{
    public static void main(String[] args)
    {
        Auto[] autos = new Auto[3];
        autos[0] = new Auto("VW", 230, "weiß");
        autos[1] = new Auto("BMW", 430, "blau");
        autos[2] = new Auto("Mercedes", 500, "grau");

        for (Auto auto : autos)
        {
            System.out.println(auto);
        }

        Auto maxDisplacement = autos[0];
        for (Auto e : autos)
        {
            if (e.getDisplacement() > maxDisplacement.getDisplacement())
            {
                maxDisplacement = e;
            }
        }
        System.out.println("The car with biggest engine displacement is " + maxDisplacement);
    }
}