package in.co.Exercise9_7;

public class Person  {
	protected String firstName;
	protected String lastName;

	@Override
	public String toString() {
		String fullname=firstName+lastName;
		return fullname;
	}
	public Person(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}
}
