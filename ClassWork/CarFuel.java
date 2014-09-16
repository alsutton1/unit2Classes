

/**
 * Car class tracks the fuel remaining in the car as it driven based on it's fuel efficiency
 * 
 * @author (Alex S.) 
 * @version (v. 1, 9/12/14)
 */
public class CarFuel
{    /** description of instance variable feulEfficiency (measures fuel efficiency in miles per gallon) */
    private double fuelEfficiency;
    /** number of gallons of fuel left in the tank of this car */
    private double fuelRemain;

    /**
     * constuctor for a car of the specified fuel efficeincy
     */
    public CarFuel(double efficiency)
    {
        this.fuelEfficiency = efficiency;
        fuelRemain = 0;
    }

    /**
     * adds specified number of gallons of fuel to this car's tank
     *
     * @pre        specified gallons will not exceed more than the car's tank capacity
     * 
     * @post    postconditions for the method
     * 
     * @param    gallons --- number of gallons of fuel to add to this car's tank
     * 
     */
    public void addGas(double gallons)
    {
        this.fuelRemain = this.fuelRemain + gallons;
    }
    
    
    /** 
     * updateds the fuel in this car's tank based on the specified number of miles and tank efficiency
     * 
     * @pre     vehicle will not exceed more than there is in the fuel tank for miles per gallon
     * 
     * @post    
     * 
     * @param   miles --- number of miles traveled by the car compared to its miles per gallon
     * 
     */
    public void drive(double miles)
    {
        double gallonsBurned = miles/this.fuelEfficiency;
        this.fuelRemain = this.fuelRemain - gallonsBurned;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public double getGasInTank()
    {
        return this.fuelRemain;
    }

    
}
