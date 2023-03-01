package in.co.collectionInterface;

public class TestEmployee {

	public static void main(String[] args) {
		Employee_ToString e1=new Employee_ToString("lakhan","indore");
		Employee_ToString e2=new Employee_ToString("lakhan","indore");
		Employee_ToString e3=new Employee_ToString("ram","indore");
		Employee_ToString e4=new Employee_ToString("balram","indore");
		Employee_ToString e5=new Employee_ToString("krishna","indore");
		
System.out.println(e1);
System.out.println(e1.equals(e2));
	}

}
