import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.Random;


public class Sun
{
    //creates the randomly placed sun around the buildings
    private int x, y;
    
    public Sun()
    {
        //gets the random x value for the sun
        Random num = new Random();
        x = num.nextInt(800)+101;
        y = 50;
    }
    
    public void draw(Graphics2D g2)
    {
        //draws the sun at the random location on the x and set shape
        int r1 = 50;
        int r2 = 50;
        Ellipse2D.Double Sun = new Ellipse2D.Double(x, y, r1, r2);
        g2.fill(Sun);
    }
}
    