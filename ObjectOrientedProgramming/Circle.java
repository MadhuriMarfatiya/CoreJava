package in.co.objectOrientedProgramming;

public class Circle extends Shape{
	private int radius=0;
	public static final float PI=3.14f;
	//private double area =0;

	
	
	public void setRadius(int radius) {
		this.radius=radius;
	}
	
	public int getRadius() {
		return radius;
			}
	public double area() {
		double area=PI*getRadius()*getRadius();
		return area;
	
}
}