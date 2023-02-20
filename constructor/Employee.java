package in.co.constructor;

public class Employee extends Person1{

	protected String designation =null;
	
	public Employee() {
		System.out.println("Default construtor");
	}
	public Employee(String fn,String ln,String des) {
		super(fn,ln);
		designation=des;
		System.out.println("3 param constructor");
	}
}
