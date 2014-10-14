import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JFrame;

public class Ground
{
    //creates the ground, which reshapes itself to the frame height and width
    private int width, height;
    public Ground(int xwidth, int yheight)
    {
        //creates the ground's width and height from set location
        width = xwidth;
        height = yheight - 425;
    }
    
    public void draw(Graphics2D g2)
    {
        //draws the ground at a set starting point
        int x = 0;
        int y = 425;
        Rectangle ground = new Rectangle(x, y, width, height);
        g2.fill(ground);
    }
}
        