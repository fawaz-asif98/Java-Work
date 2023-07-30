package P04.full_credit;

public abstract class Product
{
    protected double cost;
    protected String name;

    public Product(String name, double cost)
    {
        this.name = name;
        this.cost = cost;
        if(cost < 0)
        {
            throw new RuntimeException("Cost can't be below zero!");
        }
    }

    public abstract double price();

    @Override
    public String toString()
    {
        return name + " ($" + String.format("%.2f",cost) + ") " + "\t\t$" + String.format("%.2f", price());
    }
}