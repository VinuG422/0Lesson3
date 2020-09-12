package model;

import java.awt.Graphics2D;
import java.awt.Color;

public class Circle extends Shape {

	private float radius;

	public Circle(float x, float y, Color color, float radius){
		super(x,y,color);
		this.radius = radius;
	}

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return (float) (radius * radius * Math.PI);
	}

	@Override
	public void render(Graphics2D g2) {
		g2.setColor(super.getColor());
		g2.drawOval((int)super.getX(), (int)super.getY(), (int)(radius*2), (int)(radius*2));

	}

	@Override
	public String toString(){
		return "[Circle:" + super.toString() + "r="+radius+"]";
	}

	
}
