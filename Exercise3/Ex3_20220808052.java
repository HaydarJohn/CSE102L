import Book.EBook;

public class Ex3_20220808052
{
    public static void main(String[] args) 
    {
        Author yanki = new Author("Yakup Yanki", "Aydin", "crayzboy_89@hotmail.com");
        EBook per = new EBook("31", "sea", yanki, "www.indiremezsin.com/Download", 48.53);
        PaperBook fiz = new PaperBook("null", "null", yanki, 69.420, true);
        System.out.println(per.getTitle());

    }
}

class Author
{
    private String name;
    private String surname;
    private String mail;


    Author(String name,String surname,String mail)
    {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
}


class Book
{
    private String isbn;
    private String title;
    private Author author;
    private double price;

    Book(String isbn,String title,Author author,double price)
    {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    Book(String isbn,String title,Author author)
    {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = 15.25;
    }

    public String getIsbn() {
        return isbn;
    }
    public String getTitle() {
        return title;
    }
    public Author getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

}
class EBook extends Book
    {
        private String downloadUrl;
        private double sizeMb;

        EBook(String isbn,String title,Author author,double price,String downloadUrl,double sizeMb)
        {
            super(isbn, title, author,price);
            this.downloadUrl = downloadUrl;
            this.sizeMb = sizeMb;
        }

        EBook(String isbn,String title,Author author ,String downloadUrl,double sizeMb)
        {
            super(isbn, title, author);
            this.downloadUrl = downloadUrl;
            this.sizeMb = sizeMb;
        }

        public String getDownloadUrl() {
            return downloadUrl;
        }
        public double getSizeMb() {
            return sizeMb;
        }
    }

    class PaperBook extends Book
    {
        private int shippingWeight;
        private boolean inStock;

        PaperBook(String isbn,String title,Author author,double price,int shippingWeight,boolean inStock)
        {
            super(isbn, title, author,price);
            this.shippingWeight = shippingWeight;
            this.inStock = inStock;
        }

        PaperBook(String isbn,String title,Author author,double price,boolean inStock)
        {
            super(isbn, title, author,price);
            this.shippingWeight = (int)(Math.random() * (15 - 5 + 1) + 5);
            this.inStock = inStock;
        }

        public int getShippingWeight() {
            return shippingWeight;
        }

        public boolean getInStock()
        {
            return inStock;
        }

        public void setInStock(boolean inStock) {
            this.inStock = inStock;
        }

        
    }