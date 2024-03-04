import java.awt.*;
import java.awt.geom.*;
public class GlassPane implements DrawingObject {
    private double x, y, size;
	private String className;
	
    public GlassPane(double x, double y, double size) {
		this.x = x;
		this.y = y;
		this.size = size;
		className = "GlassPane";
    }
	public String returnClassName () {
        return className;
    }
    public void draw(Graphics2D g2d){
        Rectangle r1 = new Rectangle(x,y,size,15,new Color(171,187,184));
		r1.draw(g2d);
		
		Rectangle r2 = new Rectangle(x,y,15,size,new Color(171,187,184));
		r2.draw(g2d);
		
		Rectangle r3 = new Rectangle(x+size,y,15,size,new Color(171,187,184));
		r3.draw(g2d);
		
		Rectangle r4 = new Rectangle(x,y+size,size+15,15,new Color(171,187,184));
		r4.draw(g2d);
		
		Square s1 = new Square(x+30,y+60,15,new Color(134,166,168));
		s1.draw(g2d);
		
		Square s2 = new Square(x+45,y+45,15,new Color(168,187,185));
		s2.draw(g2d);
		
		Square s3 = new Square(x+60,y+30,15,new Color(168,187,185));
		s3.draw(g2d);
		
		Square s4 = new Square(x+size-45,y+size-30,15,new Color(168,187,185));
		s4.draw(g2d);
		
		Square s5 = new Square(x+size-30,y+size-45,15,new Color(168,187,185));
		s5.draw(g2d);
    }
    public void adjustX(double distance){
        
    }
    public double getX() {
        return x;
    }
}
