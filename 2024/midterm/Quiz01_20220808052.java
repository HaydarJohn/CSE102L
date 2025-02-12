import java.util.ArrayList;
import java.util.Date;

public class Quiz01_20220808052 {

    public static void main(String[] args) {
        
    }
}

interface Item extends Comparable
{
    public double getPrice();
    public String getName();

}

interface PaymentMethod
{
    public boolean pay(ArrayList<Item> cart);
}

interface Colorable
{
    public void paint(String color);
}

abstract class Product implements Item
{
    private String name;
    private double price;
    
    public Product(String name,double price)
    {
        setName(name);
        setPrice(price);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPrice(double price) 
    {
        if(price < 0)
        {
            throw new InvalidPriceException(price);
        }
        this.price = price;
    }

}

class Tax implements Item
{
    private double taxRate;
    private Item item;

    public Tax(int taxRate,Item item)
    {
        this.taxRate = taxRate/100.0;
        this.item = item;
    }

    @Override
    public double getPrice() {
        // TODO Auto-generated method stub
        return  ((Product)item).getPrice() + ((Product)item).getPrice() * taxRate;
    }
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return ((Product)item).getName();
    }
    @Override
    public int compareTo(Object arg0) {
        // TODO Auto-generated method stub
        return (int)(((Product)item).getPrice() - ((Product)arg0).getPrice());
    }
}

class Discount implements Item
{
    private double percent;
    private Item item;

    Discount(int percent,Item item)
    {
        this.item = item;
        this.percent = percent /100.0;
    }

    @Override
    public double getPrice() {
        // TODO Auto-generated method stub
        return  ((Product)item).getPrice() + ((Product)item).getPrice() * percent;
    }
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return ((Product)item).getName();
    }
    @Override
    public int compareTo(Object arg0) {
        // TODO Auto-generated method stub
        return (int)(((Product)item).getPrice() - ((Product)arg0).getPrice());
    }
}


class CreditCard implements PaymentMethod
{
    private long cardNumber;
    private String holderName;
    private Date expirationDate;
    private int cvv;

    public CreditCard(long cardNumber,String holderName,Date expirationDate,int cvv)
    {
        setCardNumber(cardNumber);
        this.holderName = holderName;
        this.expirationDate = expirationDate;
        setCvv(cvv);
    }

    public void setCardNumber(long cardNumber) {
        try {
            if(cardNumber < 1000000000000000L || cardNumber > 9999999999999999L )
        {
            throw new CreditCardException(cardNumber);
        }
        this.cardNumber = cardNumber;
        } catch (CreditCardException e) {
            // TODO: handle exception
        }
    }

    public void setCvv(int cvv) {
        try {
            if(cvv < 100 || cvv > 999)
        {
            throw new CreditCardException(cvv);
        }
        this.cvv = cvv;
        } catch (CreditCardException e) {
            // TODO: handle exception
        }
    }
    @Override
    public boolean pay(ArrayList<Item> cart) {
        // TODO Auto-generated method stub
        return false;
    }
}

class PayPal implements PaymentMethod
{
    private String username;
    private String password;

    public PayPal(String username,String password)
    {
        this.password = password;
        this.username = username;
    }

    @Override
    public boolean pay(ArrayList<Item> cart) {
        // TODO Auto-generated method stub
        return false;
    }
}

class Customer
{
    private String name;
    private PaymentMethod paymentMethod;
    
}



// Exceptions


class CreditCardException extends Exception
{
    private long cardNumber;
    private int cvv;

    public CreditCardException(int ccv)
    {
        super("Error: Invalid ccv " + ccv);
        this.cvv = ccv;
    }
    public CreditCardException(long cardNumber)
    {
        super("Error: Invalid card number " + cardNumber);
        this.cardNumber = cardNumber;
    }
    public int getCvv() {
        return cvv;
    }
    public long getCardNumber() {
        return cardNumber;
    }
}

class  InvalidPriceException extends RuntimeException
{
    private double price;

    public InvalidPriceException(double price)
    {
        super("ERROR: Invalid price: " + price);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

}