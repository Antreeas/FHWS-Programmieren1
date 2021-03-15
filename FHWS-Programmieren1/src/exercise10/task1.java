package exercise10;

public class task1 extends exercise09.task1.Car
{
    public static void main(String[] args)
    {
        exercise09.task1.Car[] cars = new exercise09.task1.Car[3];
        cars[0] = new task1("VW", 230, "weiß");
        cars[1] = new task1("BMW", 430, "blau");
        cars[2] = new task1("Mercedes", 500, "grau");

        int averagePrice = calculateRevenue(20000);
        System.out.println("The total revenue is " + averagePrice + "€.");
    }

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
        task1.producedCars = producedCars;
    }
    //endregion

    //region Constructors
    public task1(String brand, int displacement, String color)
    {
        new exercise09.task1().super(brand, displacement, color);
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