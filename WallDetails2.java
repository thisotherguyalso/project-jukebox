import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class WallDetails2 implements DrawingObject{
	private double x,y;
	private String className;
	public WallDetails2(double x, double y){
		this.x = x;
		this.y = y;
		className = "WallDetails2";
	}
	public String returnClassName () {
        return className;
    }
	
	public void draw(Graphics2D g2d){		
		Rectangle r1 = new Rectangle(x,y+50,10,20,new Color(49,38,20));
		r1.draw(g2d);
		
		Rectangle r2 = new Rectangle(x+50,y+30,10,30,new Color(49,38,20));
		r2.draw(g2d);
		
		Rectangle r3 = new Rectangle(x+100,y+30,10,50,new Color(49,38,20));
		r3.draw(g2d);
		
		Rectangle r4 = new Rectangle(x+75,y+60,10,25,new Color(49,38,20));
		r4.draw(g2d);
		
		Rectangle r5 = new Rectangle(x-30,y+45,10,30,new Color(49,38,20));
		r5.draw(g2d);
	}
	
	public void adjustX(double distance){
	
	}
	
	public double getX(){
		return x;
	}
}