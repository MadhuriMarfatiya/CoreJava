package in.co.constructor;

public class Triangle extends Shape{

	private int base=0;
	private int hight=0;
	
	public Triangle() {
		
	}
	public Triangle(int base,int hight) {
		this.base=base;
		this.hight=hight;
	}
	public int getBase() {
		return base;
	}
	public int getHight() {
		return hight;
	}
	public double area() {
		double area = (0.5*getBase()*getHight());
		return area;
	}
}
