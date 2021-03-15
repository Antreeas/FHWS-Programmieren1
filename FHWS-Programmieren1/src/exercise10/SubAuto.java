package exercise10;

import exercise09.Auto;

public class SubAuto extends Auto
{
    //region Attributes
    private static int producedCars = 0;
    //endregion

    //region Getter and Setter
    public static int getProducedCars()
    {
        return producedCars;
    }

    public static void setProducedCars(int producedCars)
    {
        SubAuto.producedCars = producedCars;
    }
    //endregion

    //region Constructors
    public SubAuto(String brand, int displacement, String color)
    {
        super(brand, displacement, color);
        producedCars++;
    }
    //endregion

    //region Methods
    public static int calculateRevenue(int averagePrice)
    {
        return producedCars * averagePrice;
    }
    //endregion
}