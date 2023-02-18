package in.co.constructor;

public class Circle extends Shape{

	
	private int radius;
	public  static final float PI=3.14f;
	
	public Circle() {
		
	}
	
	public Circle(int radius) {
		this.radius=radius;
	}
	public int getRadius() {
		return radius;
	}
	public double area() {
	double area = PI*getRadius()*getRadius();	
	return area;
	}
}
