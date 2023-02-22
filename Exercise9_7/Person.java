package in.co.Exercise9_7;

public class Person  {
	protected String firstName;
	protected String lastName;
	public String toString() {
		String fullName=firstName+lastName;
		return fullName;
	}
	public Person(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}
}
