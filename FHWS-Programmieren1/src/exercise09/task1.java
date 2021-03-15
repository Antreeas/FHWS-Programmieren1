package exercise09;

public class task1
{
    public static void main(String[] args)
    {
        Car[] cars = new Car[3];
        cars[0] = new task1().new Car("VW", 230, "weiß");
        cars[1] = new task1().new Car("BMW", 430, "blau");
        cars[2] = new task1().new Car("Mercedes", 500, "grau");

        for (Car car : cars)
        {
            System.out.println(car);
        }

        Car maxDisplacement = cars[0];
        for (Car e : cars)
        {
            if (e.getDisplacement() > maxDisplacement.getDisplacement())
            {
                maxDisplacement = e;
            }
        }
        System.out.println("The car with biggest engine displacement is " + maxDisplacement);
    }

    public class Car
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
        public Car(String brand, int displacement, String color)
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
}