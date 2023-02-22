package in.co.constructor;

public class Employee extends Person1{

	protected String designation =null;
	
	public Employee() {
		super();
		System.out.println("Default construtor of employee class");
	}
	public Employee(String fn,String ln,String des) {
		
		super(fn,ln);
		
		designation=des;
		System.out.println("3 param constructor of employee ");
	}
	
	public void changeAddress() {
		System.out.println("*******");
		super.changeAddress();
		System.out.println("Employee change address");
	}
}
