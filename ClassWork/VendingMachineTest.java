

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendingMachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    /** description of instance variable x (add comment for each instance variable) */
    /**
     * Default constructor for objects of class VendingMachineTest
     */
    public VendingMachineTest()
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
    public void testInsertToken()
    {
        VendingMachine testVending = new VendingMachine(20);
        testVending.insertToken(2);
        int tokens = testVending.returnTokens();
        int cans = testVending.returnCans();
        assertEquals(18.0, cans, 13-6);
        assertEquals(2.0, tokens, 1e-6);
        
    }
    
    @Test
    public void testFillUp()
    {
        VendingMachine testVending = new VendingMachine(10);
        testVending.fillUp(10);
        int cans = testVending.returnCans();
        assertEquals(20.0, cans, 1e-6);
    }
}
