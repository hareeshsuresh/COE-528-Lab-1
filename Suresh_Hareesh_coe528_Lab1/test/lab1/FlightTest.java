package lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hsuresh
 */
public class FlightTest {

    private Object expResult;
    
    public FlightTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testConstructor() {
        boolean exceptionThrown = false;
        System.out.println("constructor");
        try{
            Flight instance = new Flight(100, "Toronto", "Sydney", "01/25/2023 12:00PM", 200, 600);
        }
        catch(IllegalArgumentException e)
        {
            exceptionThrown = true;
        }
        assertTrue(!exceptionThrown);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        @Test
        public void testInvalidConstructor() {
        boolean exceptionThrown = false;
        System.out.println("constructor");
        try{
            Flight instance = new Flight(100, "Toronto", "Toronto", "01/25/2023 12:00PM", 200, 600);
        }
        catch(IllegalArgumentException e)
        {
            exceptionThrown = true;
        }
        assertTrue(exceptionThrown);
        }
    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        System.out.println("bookASeat");
        Flight instance = new Flight(1, "[Origin", "[Destination]", "01/25/2023", 1, 1);
        boolean expResult = true;
        boolean result = instance.bookASeat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        System.out.println("getFlightNumber");
        Flight instance = new Flight(1, "[Origin", "[Destination]", "01/25/2023", 1, 1);
        int expResult = 1;
        int result = instance.getFlightNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFlightNumber method, of class Flight.
     */
    @Test
    public void testSetFlightNumber() {
        System.out.println("setFlightNumber");
        int flightNumber = 0;
        Flight instance = new Flight(1, "[Origin", "[Destination]", "01/25/2023", 1, 1);
        instance.setFlightNumber(2);
        int expResult= 2;
        int result = instance.getFlightNumber();
        assertEquals (expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
       System.out.println("getOrigin");
        Flight instance = new Flight(1, "[Origin", "[Destination]", "01/25/2023", 1, 1);
        int expResult = 1;
        int result = instance.getFlightNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        System.out.println("setOrigin");
        int Origin = 0;
        Flight instance = new Flight(1, "[Origin", "[Destination]", "01/25/2023", 1, 1);
        instance.setFlightNumber(2);
        int expResult= 2;
        int result = instance.getFlightNumber();
        assertEquals (expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        Flight instance = new Flight(1, "[Origin", "[Destination]", "01/25/2023", 1, 1);
        int expResult = 1;
        int result = instance.getFlightNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**@Test
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        int Destination = 0;
        Flight instance = new Flight(1, "[Origin", "[Destination]", "01/25/2023", 1, 1);
        instance.setFlightNumber(2);
        int expResult= 2;
        int result = instance.getFlightNumber();
        assertEquals (expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
       System.out.println("getDepartureTime");
        Flight instance = new Flight(1, "[Origin", "[Destination]", "01/25/2023", 1, 1);
        int expResult = 1;
        int result = instance.getFlightNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        System.out.println("setDepartureTime");
        int DepartureTime = 0;
        Flight instance = new Flight(1, "[Origin", "[Destination]", "01/25/2023", 1, 1);
        instance.setFlightNumber(2);
        int expResult= 2;
        int result = instance.getFlightNumber();
        assertEquals (expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        Flight instance = new Flight(1, "[Origin", "[Destination]", "01/25/2023", 1, 1);
        int expResult = 1;
        int result = instance.getFlightNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int Capacity = 0;
        Flight instance = new Flight(1, "[Origin", "[Destination]", "01/25/2023", 1, 1);
        instance.setFlightNumber(2);
        int expResult= 2;
        int result = instance.getFlightNumber();
        assertEquals (expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        System.out.println("getNumberOfSeatsLeft");
        Flight instance = new Flight(1, "[Origin", "[Destination]", "01/25/2023", 1, 1);
        int expResult = 1;
        int result = instance.getFlightNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetNumberOfSeatsLeft() {
        System.out.println("setNumberOfSeatsLeft");
        int NumberOfSeatsLeft = 0;
        Flight instance = new Flight(1, "[Origin", "[Destination]", "01/25/2023", 1, 1);
        instance.setFlightNumber(2);
        int expResult= 2;
        int result = instance.getFlightNumber();
        assertEquals (expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        System.out.println("getOriginalPrice");
        Flight instance = new Flight(1, "[Origin", "[Destination]", "01/25/2023", 1, 1);
        int expResult = 1;
        int result = instance.getFlightNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        System.out.println("setOriginalPrice");
        int OriginalPrice = 0;
        Flight instance = new Flight(1, "[Origin", "[Destination]", "01/25/2023", 1, 1);
        instance.setFlightNumber(2);
        int expResult= 2;
        int result = instance.getFlightNumber();
        assertEquals (expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString()
    {
	System.out.println("testToString");
	Flight instance = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1);
	String expResult = "Flight 1, [Origin] to [Destination], 01/01/01 01:01:01, Original Price: 1.0";
        String result = instance.toString();
	assertEquals(expResult, result);
	//TODO review the generated test code and remove the default call to fail.
	//fail("The test case is a prototype.");
    }
    
}
