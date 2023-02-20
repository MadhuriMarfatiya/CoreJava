package in.co.constructor;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Shape s1= new Shape(); Shape s2= new Shape("red",10); System.out.println(s1);
		 * //System.out.println(s1.getColor()); System.out.println(s2.getColor());
		 * System.out.println(s2.getBorderWidth());
		 */
		
		Rectangle r1=new Rectangle(10,20);
		//r1.area();
		System.out.println("length of rectangle:"+r1.getLength());
		System.out.println("Width of rectangle:"+r1.getWidth());
		System.out.println("area of Rectangle:"+r1.area());
		
		Circle c1=new Circle(10);
		c1.area();
		System.out.println("radius is :"+c1.getRadius());
		System.out.println("area of circle is : "+c1.area());
		
		Triangle t1=new Triangle(10,20);
		t1.area();
		System.out.println("Base of Triangle: "+t1.getBase());
		System.out.println("Hight of Triangle: "+t1.getHight());	
	}
}
