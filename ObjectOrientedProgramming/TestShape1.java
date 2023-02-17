package in.co.objectOrientedProgramming;

public class TestShape1 {

	public static void main(String[] args) {

		Shape s = new Rectangle();
		Rectangle r = (Rectangle) s;
		
		r.setLength(10);
		r.setWidth(5);
		r.setColor("blue");

		System.out.println("Property of Parent class Shape: color :"+r.getcolor());

	}
}
