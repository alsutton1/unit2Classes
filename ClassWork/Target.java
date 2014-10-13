import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Target
{
    private int circleX;
    private int circleY;
    public Target(int x, int y)
    {
        circleX = x;
        circleY = y;
    }

    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double c1 = new Ellipse2D.Double(circleX, circleY, 30, 30);
        g2.draw(c1);
    }
}
