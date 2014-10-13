

/**
 * Write a description of class Door here.
 * 
 * @author (Alex Sutton and Duke Deezy ) 
 * @version (a version number or a date)
 */
public class Door
{
    /** description of instance variable x (add comment for each instance variable) */
    private String doorType;
    /** determines the type of door */
    private String doorState;
    /** determines the door's state, open or closed */

    /**
     * Default constructor for objects of class Door
     */
    public Door(String type, String state)
    {
        // initialise instance variables
        this.doorType = type;
        doorState = state;
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
    public String close()
    {
        // put your code here
        doorState = "Closed";
        return doorState;
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
    public String open()
    {
        // put your code here
        doorState = "Open";
        return doorState;
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
    public String getDoorType()
    {
        // put your code here
        return this.doorType;
    }
    
    public String getDoorState()
    {
        return this.doorState;
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
    public void setDoorType(String newDoorType)
    {
        // put your code here
        this.doorType = newDoorType;
    }

    public void setDoorState(String newDoorState)
    {
        this.doorState = newDoorState;
    }
     
}
