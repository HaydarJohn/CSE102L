interface Common<T>
{
    public boolean isEmpty();
    public T peek();
    public int size();
}


interface Node<T>
{
    final static int DEFAULT_CAPACITY = 2;
    public T getNext();
    public double getPriority();
    public void setNext(T item);

}

interface Package<T>
{
    public T extract();
    public double getPriority();
    public boolean isEmpty();
    public boolean pack(T item);
}

interface PriorityQueue<T> extends Common<T>
{
    final static int FLEET_CAPACITY = 3;
    public T dequeue();
    public boolean enqueue(T item);
}

interface Sellable
{
    public String getName();
    public double getPrice();   
}

interface Stack<T> extends Common<T>
{
    T pop();
    boolean push(T item);
}

interface Wrappable extends Sellable
{
    
}
