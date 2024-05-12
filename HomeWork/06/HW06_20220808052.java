public class HW06_20220808052 
{
    
}


interface Sellable
{
    String getName();
    String getPrice();
}

interface Package<T>
{
    T extract();
    boolean pack(T item);
    boolean isEmpty();
}

interface Wrappable extends Sellable
{

}


class Product
{
    private String name;
    private double price;
    Product(String name,double price)
    {
        
    }
}