

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class CarFuelTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarFuelTest
{
    /** description of instance variable x (add comment for each instance variable) */
    /**
     * Default constructor for objects of class CarFuelTest
     */
    public CarFuelTest()
    {
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testgetGasInTank()
    {
        CarFuel testCar = new CarFuel(50);
        double gallons = testCar.getGasInTank();
        assertEquals(0.0, gallons, 1e-6);
        
    }
    
    @Test
    public void testAddGas()
    {
        CarFuel testCar = new CarFuel(50);
        testCar.addGas(20);
        double gallons = testCar.getGasInTank();
        assertEquals(20.0, gallons, 13-6);
        
        testCar.addGas(5);
        gallons = testCar.getGasInTank();
        assertEquals(25.0, gallons, 1e-6);
    }
    
    @Test
    public void testDrive()
    {
        CarFuel testCar = new CarFuel(50);
        testCar.addGas(20);
        testCar.drive(25);
        double gallons = testCar.getGasInTank();
        assertEquals(19.5, gallons, 1e-6);
        
        testCar.drive(100);
        gallons = testCar.getGasInTank();
        assertEquals(17.5, gallons, 1e-6);
    }
}
