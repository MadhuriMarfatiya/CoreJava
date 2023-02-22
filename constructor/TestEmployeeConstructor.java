package in.co.constructor;

public class TestEmployeeConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e=new Employee();
		Employee e1= new Employee("Madhuri","Rami","Manager");
		
		System.out.println(e1.firstname);
		System.out.println(e1.lastname);
		System.out.println(e1.designation);
		e1.changeAddress();
		
	}

}
