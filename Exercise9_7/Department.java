package in.co.Exercise9_7;

public class Department implements Cloneable {

	public Employee employee1 = null;
	public Employee employee2 = null;

	public Department() {
	}

	public Department(Employee employee1, Employee employee2) {
		this.employee1 = employee1;
		this.employee2 = employee2;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

}
