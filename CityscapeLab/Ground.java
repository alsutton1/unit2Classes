import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JFrame;

public class Ground
{
    private int width, height;
    public Ground(int xwidth, int yheight)
    {
        width = xwidth;
        height = yheight - 425;
    }
    
    public void draw(Graphics2D g2)
    {
        int x = 0;
        int y = 425;
        Rectangle ground = new Rectangle(x, y, width, height);
        g2.fill(ground);
    }
}
        