package in.co.constructor;

public class Person1 {

	protected String firstname=null;
	protected String lastname=null;
	protected String address=null;
	
	public Person1() {
		System.out.println("Default constructor of parent class Person1");
	}
	public Person1(String fn,String ln) {
		firstname=fn;
		lastname=ln;
		System.out.println("2 param constructor of preson class");
	}
	public Person1(String fn,String ln,String address) {
		this(fn,ln);
		this.address=address;
		System.out.println("3 param constructor of person class");
	}
	public void changeAddress() {
		System.out.println("person change address");
	}
	
}
