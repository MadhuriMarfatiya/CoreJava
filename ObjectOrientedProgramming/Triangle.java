package in.co.objectOrientedProgramming;

public class Triangle extends Shape {

	private int base=0;
	private int hight=0;
	//private double area =0;
	

	public void setBase(int base) {
		this.base=base;
	}
	public int getBase() {
		return base;
	}

	public void setHight(int hight) {
		this.hight=hight;
	}
	public int getHight() {
		return hight;
	}
	
	public double area() {
		double area=(0.5*getBase()*getHight());
		return area;
	}
}
