package in.co.objectOrientedProgramming;

public class Circle {
	private int radius=0;
	public static final float PI=3.14f;
	private double area =0;

	public void area() {
		float area=PI*radius*radius;
	}
	public void setRadius(int radius) {
		this.radius=radius;
	}
	
	public int getRadius() {
		return radius;
			}
	
}
