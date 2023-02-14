package ObjectOrientedProgramming;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		shape s ; //Declaration
		s=new shape(); // instantiation
		s.setColor("red");
		s.setBorderWidth(3);
		
		int borderW = s.getBorderWidth();
		String color1= s.getcolor();
		
		System.out.println(color1);
		System.out.println(borderW);
		
	}

}
