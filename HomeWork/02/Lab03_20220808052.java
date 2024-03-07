public class Lab03_20220808052 {

    public static void main(String[] args) {
        
    }

}

class Vehicle
{
    private String Brand;
    private String Model;
    private int Year;
    private boolean IsRented;

    Vehicle(String brand,String model,int year,boolean isRented)
    {
        Brand = brand;
        Model = model;
        Year = year;
        IsRented = isRented;
    }
    public String getBrand() {
        return Brand;
    }
    public String getModel() {
        return Model;
    }
    public int getYear() {
        return Year;
    }
    public boolean getIsRented()
    {
        return IsRented;
    }
    
    public void setBrand(String brand) {
        Brand = brand;
    }
    public void setIsRented(boolean isRented) {
        IsRented = isRented;
    }
    public void setModel(String model) {
        Model = model;
    }
    public void setYear(int year) {
        Year = year;
    }

}

class Car extends Vehicle
{
    private int passengerCapacity;
    private boolean automaticTransmission;

    Car(String brand,String model,int year,boolean isRented,int passengerCapacity,boolean automaticTransmission)
    {

    }
}

class Truck extends Vehicle
{

}

class Motorcycle extends Vehicle
{

}

class Customer
{

}


class RentalContrat
{

}