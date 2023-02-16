package in.co.objectOrientedProgramming;

public class Automobile {
	private String color=null;
	private int speed=0;
	private String make=null;
	public static final int no_of_gears=6;
	
	public void setColor (String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setMake(String make) {
		this.make=make;
	}
	public String getMake() {
		return make;
	}
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	public int getSpeed() {
		return speed;
	}

	public void Break(int b) {
		speed=speed-b;
		}
	public void changeGear(int cg) {
		switch (cg) {
		case 0:
			System.out.println("car is off.");
			break;
		case 1:
			System.out.println("car is on first gear");
			break;
		case 2:
			System.out.println("car is on second gear");
			break;
		case 3:
			System.out.println("car is on third gear");
			break;
		case 4:
			System.out.println("car is on fourth gear");
			break;
		case 5:
			System.out.println("car is on fifth gear");
			break;
		default:
			System.out.println("car is on reverse gear");
			break;	
		
		}
			
		//speed=cg;
		/*
		 * if(speed>80) { System.out.println("Gear is 5."); else if (spee)
		 */}
	
	public void accelerator(int ac) {
		speed=speed+ac;
	}
	
}
