package lab1;
import java.util.ArrayList;

/**
 *
 * @author hsuresh
 */
public class Manager {
    
    ArrayList<Flight> flight = new ArrayList<>();
    Ticket t;
    
    public void createFlights()
    {
        flight.add(new Flight(345, "Toronto", "Michigan", "Jan 24, 12pm", 10000, 450));
        flight.add(new Flight(459, "Montreal", "Vancouver", "May 2, 10am", 230, 900));
        flight.add(new Flight(683, "Calagary", "Nova Scotia", "Sep 24, 2pm", 400, 200));
        
    }
    
    public void displayAvailableFlights(String origin, String destination)
    {
        for(Flight f :this.flight)
        {
            if(f.getOrigin().equals(origin) && f.getDestination().equals(destination) && f.getNumberOfSeatsLeft()>0)
            {
                System.out.println(f.toString());
            }
        }                  
    }
    
    public Flight getFlight(int number)
    {
        for(Flight f : this.flight)
        {
            if(f.getFlightNumber() == number)
            {
                return f;
            }
        }
        
        return null;
    }
    
    public void bookSeat(int flightNumber, Passenger p)
    {
        Flight f = getFlight(flightNumber);
        if(f!=null)
        {
            boolean success = f.bookASeat();
            
            if(success = true)
            {
                double price = p.applyDiscount(f.getOriginalPrice());
                t= new Ticket(p,f,price);
            }
        }
    }
    
    
    public static void main(String [] args)
    {
        Passenger p = new NonMember("Sarah", 80);
        Manager manager = new Manager();
        manager.createFlights();
        manager.displayAvailableFlights("Toronto", "Michigan");
        manager.bookSeat(450, p);
        System.out.println("The following are all flights created:");
        System.out.println(manager.flight.toString());    
    }
            
    
}
