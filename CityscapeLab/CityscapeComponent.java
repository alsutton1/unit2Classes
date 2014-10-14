import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;


public class CityscapeComponent extends JComponent
{
    // calls upon the objects to create the buildings, sun, and ground
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        //get parameters for ground class
        int xwidth = this.getWidth();
        int yheight = this.getHeight();
        
        //create ground
        Ground ground = new Ground(xwidth, yheight);
        g2.setColor(Color.GREEN);
        ground.draw(g2);
        
        //creates the randomly positioned sun
        Sun sun = new Sun();
        g2.setColor(Color.YELLOW);
        sun.draw(g2);
        
        //creates the set number of buildings (7)
        Building building1 = new Building(25);
        Building building2 = new Building(150);
        Building building3 = new Building(270);
        Building building4 = new Building(390);
        Building building5 = new Building(510);
        Building building6 = new Building(630);
        Building building7 = new Building(750);
        building1.draw(g2);
        building2.draw(g2);
        building3.draw(g2);
        building4.draw(g2);
        building5.draw(g2);
        building6.draw(g2);
        building7.draw(g2);
    }

}
