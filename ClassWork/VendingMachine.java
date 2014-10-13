

/**
 * Write a description of class VendingMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachine
{
    private int tokens;
    /** number of tokens in the vending machine */
    private int cans;
    /** number of cans in the machine */

    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine(int can)
    {
        // initialise instance variables
        this.cans = can;
        tokens = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void insertToken(int token)
    {
        // put your code here
        this.tokens = this.tokens + token;
        this.cans = this.cans - token;
    }

    public void fillUp(int NewCan)
    {
        this.cans = NewCan + this.cans;
    }
    
    public int returnCans()
    {
        return this.cans;
    }
    
    public int returnTokens()
    {
        return this.tokens;
    }
}
