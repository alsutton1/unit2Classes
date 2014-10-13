import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;
import java.awt.Color;


public class Building
{
    private int x, y;
    
    public Building(int xx)
    {
        Random num = new Random();
        y = num.nextInt(200)+51;
        x = xx;
    }
    
    public void draw(Graphics2D g2)
    {   
        g2.setColor(Color.BLACK);
        int width = 100;
        int height = 450-y;
        Rectangle r1 = new Rectangle(x, y, width, height);
        g2.fill(r1);
        
        int windowHeight = height/10;
        int windowy = windowHeight;
        
        g2.setColor(Color.YELLOW);
        Rectangle w1 = new Rectangle(x+5, y+5, 25, windowHeight);
        g2.fill(w1);
        Rectangle w2 = new Rectangle(x+35, y+5, 30, windowHeight);
        g2.fill(w2);
        Rectangle w3 = new Rectangle(x+70, y+5, 25, windowHeight);
        g2.fill(w3);
        Rectangle w4 = new Rectangle(x+5, y+windowHeight+15, 25, windowHeight);
        g2.fill(w4);
        Rectangle w5 = new Rectangle(x+35, y+windowHeight+15, 30, windowHeight);
        g2.fill(w5);
        Rectangle w6 = new Rectangle(x+70, y+windowHeight+15, 25, windowHeight);
        g2.fill(w6);
        Rectangle w7 = new Rectangle(x+5, y+2*windowHeight+25, 25, windowHeight);
        g2.fill(w7);
        Rectangle w8 = new Rectangle(x+35, y+2*windowHeight+25, 30, windowHeight);
        g2.fill(w8);
        Rectangle w9 = new Rectangle(x+70, y+2*windowHeight+25, 25, windowHeight);
        g2.fill(w9);
        Rectangle w10 = new Rectangle(x+5, y+3*windowHeight+35, 25, windowHeight);
        g2.fill(w10);
        Rectangle w11 = new Rectangle(x+35, y+3*windowHeight+35, 30, windowHeight);
        g2.fill(w11);
        Rectangle w12 = new Rectangle(x+70, y+3*windowHeight+35, 25, windowHeight);
        g2.fill(w12);
        Rectangle w13 = new Rectangle(x+5, y+4*windowHeight+45, 25, windowHeight);
        g2.fill(w13);
        Rectangle w14 = new Rectangle(x+35, y+4*windowHeight+45, 30, windowHeight);
        g2.fill(w14);
        Rectangle w15 = new Rectangle(x+70, y+4*windowHeight+45, 25, windowHeight);
        g2.fill(w15);
        Rectangle w16 = new Rectangle(x+5, y+5*windowHeight+55, 25, windowHeight);
        g2.fill(w16);
        Rectangle w17 = new Rectangle(x+35, y+5*windowHeight+55, 30, windowHeight);
        g2.fill(w17);
        Rectangle w18 = new Rectangle(x+70, y+5*windowHeight+55, 25, windowHeight);
        g2.fill(w18);
    }
}
