package in.co.constructor;

public class TestShape2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sum=0.0;

		Shape s[]=new Shape[3];
		s[0]=new Rectangle(10,20);
		s[1]=new Circle(10);
		s[2]=new Triangle(10,10);
		
		for(int i=0;i<s.length;i++) {
			sum=sum+s[i].area();
			
		}System.out.println("sum of area of all:"+sum);
		
	}

}
