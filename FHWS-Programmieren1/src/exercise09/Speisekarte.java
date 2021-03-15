package exercise09;

import exercise03.Pizzarechner;

import java.util.ArrayList;

public class Speisekarte
{
    public static void main(String[] args)
    {
        Pizza[] pizzas = new Pizza[3];
        pizzas[0] = new Speisekarte().new Pizza("Margherita", 25, 5.99);
        pizzas[0].addVariation(30, 10.99);
        pizzas[1] = new Speisekarte().new Pizza("Hawaii", 25, 7.99);
        pizzas[1].addVariation(30, 11.99);
        pizzas[2] = new Speisekarte().new Pizza("Speciale", 25, 9.99);
        pizzas[2].addVariation(30, 13.99);

        for (Pizza e : pizzas)
        {
            System.out.println(e);
        }
    }

    public class Pizza
    {
        //region Attributes
        private String name;
        private ArrayList<Pizzarechner.Pizza> variation = new ArrayList<>();
        //endregion

        //region Getter and Setter
        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public ArrayList<Pizzarechner.Pizza> getVariation()
        {
            return variation;
        }

        public void setVariation(ArrayList<Pizzarechner.Pizza> variation)
        {
            this.variation = variation;
        }
        //endregion

        //region Constructors
        public Pizza(String name, double diameter, double price)
        {
            this.name = name;
            addVariation(diameter, price);
        }
        //endregion

        //region Methods
        public void addVariation(double diameter, double price)
        {
            variation.add(new Pizzarechner().new Pizza(diameter, price));
        }

        @Override
        public String toString()
        {
            return "Pizza{" +
                    "name='" + name + '\'' +
                    ", variation=" + variation +
                    '}';
        }
        //endregion
    }
}