package in.co.constructor;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s1= new Shape();
		Shape s2= new Shape("red",10);
		System.out.println(s1);
		//System.out.println(s1.getColor());
		System.out.println(s2.getColor());
		System.out.println(s2.getBorderWidth());
		
		
	}

}
