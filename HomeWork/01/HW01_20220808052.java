import java.util.Scanner;

public class HW01_20220808052
{
    public static void main(String[] args) 
    {

    }
}

class Stock
{

    private String symbol ="";
    private String name ="";
    private double previousClosingPrice = 0;
    private double currentPrice = 0;


    Stock(String symbol,String name)
    {
        this.symbol = symbol.toUpperCase();
        Scanner scan = new Scanner(name);
        while (scan.hasNext())
        {
            String temp = scan.next();
            this.name += Character.toUpperCase(temp.charAt(0)) + temp.substring(1, temp.length()).toLowerCase() + " ";
        }
        this.name = this.name.substring(0,this.name.length()-1);

    }

    public String getSymbol()
    {
        return symbol;
    }

    public String getName()
    {
        return name;
    }

    public double getCurrentPrice()
    {
        return currentPrice;
    }

    public double getPreviousClosingPrice()
    {
        return previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice)
    {
        if(currentPrice < 0)
        {
            System.out.println("ERROR!");
            return;
        }
        this.currentPrice = currentPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice)
    {
        if(currentPrice < 0)
        {
            System.out.println("ERROR!");
            return;
        }
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getChangePercent()
    {
        return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
    }


    @Override
    public String toString() {
        return String.format("%s - %s: %f",symbol,name,currentPrice);
    }


}

class Fan
{
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan()
    {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "Blue";
    }

    public Fan(double radius,String color)
    {
        super();
        this.radius = radius;
        this.color = color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public void setSpeed(int speed)
    {
        if(on)
            this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public double getRadius()
    {
        return radius;
    }

    public boolean isOn()
    {
        return on;
    }

    public void change()
    {
        on = !on;
    }


    @Override
    public String toString() {
        if(!on)
            return "Fan is off";

        return String.format("Speed: %d, Radius %.2f, Color: %s",speed,radius,color );
    }

}