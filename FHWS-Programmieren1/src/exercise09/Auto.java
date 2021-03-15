package exercise09;

public class Auto
{
    //region Attributes
    private String brand;
    private int displacement;
    private String color;
    //endregion

    //region Getter and Setter
    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public int getDisplacement()
    {
        return displacement;
    }

    public void setDisplacement(int displacement)
    {
        this.displacement = displacement > 0 ? displacement : this.displacement;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
    //endregion

    //region Constructors
    public Auto(String brand, int displacement, String color)
    {
        this.brand = brand;
        this.displacement = displacement > 0 ? displacement : 1600;
        this.color = color;
    }
    //endregion

    //region Methods
    @Override
    public String toString()
    {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", displacement=" + displacement +
                ", color='" + color + '\'' +
                '}';
    }
    //endregion
}