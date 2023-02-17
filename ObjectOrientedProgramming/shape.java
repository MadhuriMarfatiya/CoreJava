package in.co.objectOrientedProgramming;

public class Shape {
	private String color =null;
	private int borderWidth=0;
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public String getcolor() {
		return color;
	}
	
	public void setBorderWidth(int bw) {
		borderWidth=bw;
	}
	
	public int getBorderWidth() {
		return borderWidth;
	}

	public double area() {
		return 0.0;
	}

}
