package in.co.objectOrientedProgramming;

public class Triangle {

	private int base=0;
	private int hight=0;
	private double area =0;
	
	public void area() {
		area=1/2*base*hight;
	}
	public void setBase(int base) {
		this.base=base;
	}
	public int getBase() {
		return base;
	}
}
