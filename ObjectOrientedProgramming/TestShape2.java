package in.co.objectOrientedProgramming;

public class TestShape2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum =0.0;
		Shape s1[]=new Shape[3];
		
		s1[0]=new Rectangle();
		
		Rectangle r=(Rectangle)s1[0];
		r.setLength(5);
		r.setWidth(10);
		r.area();
		System.out.println("area of rectangle : "+r.area());
		
		s1[1]=new Circle();
		Circle c=(Circle)s1[1];
		c.setRadius(12);
		c.area(); 
		System.out.println("area of Circle: "+c.area());
		
		s1[2]=new Triangle();
		Triangle t=(Triangle)s1[2];
		t.setBase(12);
		t.setHight(10);
		t.area();
		System.out.println("area of triangle: "+t.area());
		
		for(int i=0;i<s1.length;i++) {
			 sum= sum + s1[i].area();
		}
		System.out.println("Sum of area of all : "+sum);
	}
}
