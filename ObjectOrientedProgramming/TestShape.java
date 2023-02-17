package in.co.objectOrientedProgramming;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s ; //Declaration
		s=new Shape(); // instantiation
		s.setColor("red");
		s.setBorderWidth(3);
		
		int borderW = s.getBorderWidth();
		String color1= s.getcolor();
		
		System.out.println(color1);
		System.out.println(borderW);
		
		Rectangle r =new Rectangle();
		Circle c =new Circle();
		Triangle t =new Triangle();
		
		r.setLength(10);
		r.setWidth(20);
		System.out.println("area of Rectangle: " +r.area());
		
		c.setRadius(10);
		System.out.println("area of Circle : " +c.area());
		
		t.setBase(10);
		t.setHight(20);
		t.setColor("white");
		System.out.println("area of Triangle: "+t.area());
		System.out.println("color got from shape class(inherted from parent class) is : "+t.getcolor());
	

	
	}
}
