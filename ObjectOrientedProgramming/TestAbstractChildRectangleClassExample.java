package in.co.objectOrientedProgramming;


public class TestAbstractChildRectangleClassExample {

	public static void main(String[] args) {
		
		AbstractChildRectangleExample c=new AbstractChildRectangleExample();
		c.setBorderWidth(10);
		c.setColor("Blue");
		System.out.println("borderwidth:"+c.getBorderWidth());
		System.out.println("Color:"+c.color);
	}
}
