package in.co.objectOrientedProgramming;

public class TestAutomobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Automobile am;
		 am= new Automobile();
		 am.setColor("white");
		 am.setMake("BMW");
		 am.setSpeed(80);
		 am.changeGear(3);
		 am.Break(30);
		 am.accelerator(30);
		
		 System.out.println("color is : "+am.getColor());
		 System.out.println("make is : "+am.getMake());
		 System.out.println("Speed is : "+am.getSpeed());
	}

}
