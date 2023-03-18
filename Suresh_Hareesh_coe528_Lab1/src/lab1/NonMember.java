package lab1;

/**
 *
 * @author hsuresh
 */
public class NonMember extends Passenger {
    
    public NonMember (String name, int age)
    {
        super(name, age);
    }
    
    @Override
    public double applyDiscount(double p)
    {
        if(super.getage() > 65)
        {
            return (p*0.1);
        }
        else
        {
            return p;
        }       
    }
    
}