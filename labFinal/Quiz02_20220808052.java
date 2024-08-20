// Possible interface : Testable

// Posible abstract class processor

// Posible abstract class person


// Engineers extends person

// Qualtiy asurance extends person

//
// initial durability is how much left to assemble it.

import java.util.LinkedList;
import java.util.List;

public class Quiz02_20220808052 {
    public static void main(String[] args) {
        
    }
}

interface Testable
{

}

abstract class Processor 
{
    private String model;
    private float frequency;
    private int memory; // Memory size

    
}


class GPU extends Processor implements Testable
{
    float quality; // 1 % 100   0 % 0
}

class CPU extends Processor
{

}


abstract class Employee
{
    String name;
    long ID;
    int experience;
}


class Engineer extends Employee
{
    // Method to improve qualityengineer
}

class ChiefEngineer extends Engineer
{
    private List<Engineer> engineers;

    public ChiefEngineer()
    {
        engineers = new LinkedList<Engineer>();
    }

    public List<Engineer> getEngineers() {
        return engineers;
    }
    public void hire(Engineer engineer)
    {
        engineers.add(engineer);
    }
    public void fire(Engineer engineer)
    {
        if(engineers.contains(engineer))
            engineers.remove(engineer);
    }

    // ability fire and hire
}


class QualtityTeam extends Employee
{
    // At the end of product line specialist 
}



class Inventory
{
    // Set
}


class ProductLine
{
    private String productType;
    private ChiefEngineer chief;
    private List<Processor> orders;
    private QualtityTeam specialist;

    public ProductLine(String poductType,ChiefEngineer chief,QualtityTeam specialist)
    {
        this.productType = productType;
        this.chief = chief;
        this.specialist = specialist;
    }

    public void produce(String model)
    {
        
    }

}




/*
 *      Hocam bunu okuyacaginiz mi emin degilim ama bunu bize final odevi
 *     olarak verseydiniz cok daha rahat olurdu. Ama genel olarak benim kafamda
 *     Chief engineerler engineerlere job assign ediyor ve liste olarak sorumlu olduklari
 *      engineerleri tutuyorlar. Product line a enineerler model ismi alarak processor uretiyor
 *      bunu product lineda quality specialiste veriyor o sadece simple conditional yapip inventore
 *      atip veya ordera geri koymayi sagliyor. CPU lari quality control yapilmiyor cunku tesable degil
 *      GPU lar da quality diye bir variable var. ama genel sistemi anlayamadigim icin implemen etmek
 *      imkansiz. product type yaptim pruductlineda ama hicbir islev bulamadim cunku CPU kontrol edilmiyor
 *       o  zaman 2 tane product line gerek yok gibi ama ilerde olabilir ona gore scale olabilir yapabilmek
 *      lazim yani diyecegim bana 3 hafta dizayna 1 hafta implemetationa zaman verseniz belki yapabilirdim.
 *      Cok guzel dusunmussunuz bunu bize gercek hayat programlari yaptirtmak istiyorsunuz ama keske 
 *      odev olsaydi. :(
 */



 //     @HaydarJohn