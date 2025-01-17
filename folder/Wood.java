import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Wood implements DrawingObject{ 
	private double x, y, size;
	
	public Wood(double x, double y, double size){
		this.x = x;
		this.y = y;
		this.size = size;
	}
	
	public void draw(Graphics2D g2d){
		Square w = new Square(x,y,size+25,new Color(43,31,17));
		w.draw(g2d);
		
		Path2D.Double line4 = new Path2D.Double();
		line4.moveTo(x,y);
		line4.lineTo(480,300);
		line4.lineTo(680,300);
		line4.lineTo(725,y);
		line4.closePath();
		g2d.setColor(new Color(43,31,17));
		g2d.fill(line4);
		g2d.draw(line4);
	}
	
	public void adjustX(double distance){

	}

	public double getX(){
		return x;
	}
}
