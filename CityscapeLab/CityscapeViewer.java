import javax.swing.JFrame;
import java.awt.Color;

/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author @alsutton1 (Alex Sutton)
 * @version 10/13/2014
 */
public class CityscapeViewer
{
    public static void main(String[] args)
    {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();
        
        //create city frame
        frame.setSize(1000, 600);
        frame.getContentPane().setBackground(Color.CYAN);
        frame.setTitle("Cityscape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // a frame contains a single component; create the Cityscape component and add it to the frame
        CityscapeComponent component = new CityscapeComponent();
        frame.add(component);
        
        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);
    }

}
