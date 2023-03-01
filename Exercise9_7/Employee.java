package in.co.Exercise9_7;

public class Employee implements Cloneable {
	public Address localAddress = null;
	public Address permanentAddress = null;

	public Employee() {

	}

	public Employee(Address localAddress, Address permanentAddress) {
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
