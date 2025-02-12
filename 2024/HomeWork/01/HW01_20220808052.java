import java.util.Scanner;

public class HW01_20220808052
{
    public static void main(String[] args) 
    {

    }
}

class Stock
{

    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;


    Stock(String symbol,String name)
    {
        setSymbol(symbol.toUpperCase());
        setName(HelperMethods.capitilzeFirstLetter(name));
    }

    private void setSymbol(String symbol)
    {
        this.symbol = symbol;
    }
    private void setName(String name)
    {
        this.name = name;
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
        if(previousClosingPrice < 0)
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























class HelperMethods
{
    public static String capitilzeFirstLetter(String string)
    {
        String resultString = "";
        Scanner scan = new Scanner(string);
        while (scan.hasNext())
        {
            String temp = scan.next().toLowerCase(); 
            temp = Character.toUpperCase(temp.charAt(0)) + temp.substring(1);
            resultString += temp;
            if(scan.hasNext()) {resultString += " ";}
        }
        return resultString;
    }
}