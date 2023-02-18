package in.co.constructor;

public class Rectangle extends Shape  {

	private int length = 0;
	private int width = 0;
	
	  
	  public Rectangle() {
	  
	  }
	 

	public Rectangle(int length, int width) {
		 this.length=length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public double area() {
		double area = getWidth() * getLength();
		return area;

	}
}
