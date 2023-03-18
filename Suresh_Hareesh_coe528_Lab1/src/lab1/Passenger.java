package lab1;

/**
 *
 * @author hsuresh
 */
public abstract class Passenger {
    
    private String name;
    private int age;

    public Passenger(String n, int a)
    {
        this.name = n;
        this.age = a;
    }
    
    public void setname(String n)
    {
        this.name = n;
    }
    
    public String getname()
    {
        return this.name;
    }
    
    public void setage (int a)
    {
        this.age = a;
    }
    
    public int getage()
    {
        return this.age;
    }
    
    abstract double applyDiscount(double p);
  
}