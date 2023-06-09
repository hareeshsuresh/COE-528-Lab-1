package lab1;

/**
 *
 * @author hsuresh
 */
public class Member extends Passenger {
    
    private int yearsOfMembership; 
        
    public Member (String name, int age, int yearsOfMembership)
    {
        super(name, age);
        this.yearsOfMembership = yearsOfMembership;
    }

    
    //Override discount method for Members
    @Override
    public double applyDiscount (double p)
    {
        if (yearsOfMembership > 5)
        {
           // 50% discount on the ticket
            return (p*0.5);
        }
        
        else if(yearsOfMembership > 1 && yearsOfMembership <= 5)
        {
            // 10% discount on the ticket
            return (p*0.1);
        }
        
        else
        {
            return p;
        }
    }
    
}