package in.co.objectOrientedProgramming;

public class Businessman extends Person implements Richman,SocialWorker{

	
	public void helpToOthers() {
		System.out.println("help others...");	
	
	}
	public void earnMoney() {
		System.out.println("Earn money");	
	}
	public void donation() {
		System.out.println("donation...");
	}
	
	public void party() {
		System.out.println("Does party");
		
	}

	
}
