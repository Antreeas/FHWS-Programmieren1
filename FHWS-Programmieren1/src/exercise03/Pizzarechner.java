package exercise03;

public class Pizzarechner
{
    public static void main(String[] args)
    {
        Pizza pizza1 = new Pizzarechner().new Pizza(26, 11);
        Pizza pizza2 = new Pizzarechner().new Pizza(24, 10);
        new Pizzarechner().pizzaComparator(pizza1, pizza2);
    }

    private void pizzaComparator(Pizza pizza1, Pizza pizza2)
    {
        double pizza1Ratio = pizza1.calculateAreaPriceRatio();
        double pizza2Ratio = pizza2.calculateAreaPriceRatio();
        System.out.printf("1. Pizza: %.2f Size/Price ratio\n", pizza1Ratio);
        System.out.printf("2. Pizza: %.2f Size/Price ratio\n", pizza2Ratio);

        if (pizza1Ratio > pizza2Ratio)
        {
            System.out.println("Pizza 1 has the better Size/Price ratio.");
        } else if (pizza1Ratio < pizza2Ratio)
        {
            System.out.println("Pizza 2 has the better Size/Price ratio.");
        } else
        {
            System.out.println("Pizza 1 and 2 have the same Size/Price ratio.");
        }
    }

    public class Pizza
    {
        //region Attributes
        private double diameter;
        private double price;
        //endregion

        //region Getter and Setter
        public double getDiameter()
        {
            return diameter;
        }

        public void setDiameter(double diameter)
        {
            this.diameter = diameter;
        }

        public double getPrice()
        {
            return price;
        }

        public void setPrice(double price)
        {
            this.price = price;
        }
        //endregion

        //region Constructors
        public Pizza(double diameter, double price)
        {
            this.diameter = diameter;
            this.price = price;
        }
        //endregion

        //region Methods
        public double calculateArea()
        {
            return Math.PI * Math.pow(diameter / 2, 2);
        }

        public double calculateAreaPriceRatio()
        {
            return this.calculateArea() / price;
        }

        @Override
        public String toString()
        {
            return diameter + "cm " + price + "€";
        }
        //endregion
    }
}