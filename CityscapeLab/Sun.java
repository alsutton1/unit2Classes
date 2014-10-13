import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.Random;


public class Sun
{
    private int x, y;
    
    public Sun()
    {
        Random num = new Random();
        x = num.nextInt(800)+101;
        y = 50;
    }
    
    public void draw(Graphics2D g2)
    {
        int r1 = 50;
        int r2 = 50;
        Ellipse2D.Double Sun = new Ellipse2D.Double(x, y, r1, r2);
        g2.fill(Sun);
    }
}
    