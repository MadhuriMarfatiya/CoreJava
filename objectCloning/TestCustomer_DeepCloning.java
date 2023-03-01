package in.co.objectCloning;

public class TestCustomer_DeepCloning {

	public static void main(String[] args) throws Exception {
		Customer c1=new Customer("Ram");


//clone the customer and change the value
		Customer c2=(Customer) c1.clone();
		c2.name="Balram";
		c2.account.balance=20;
		
		System.out.println("Original Object");
		System.out.println("Name : "+c1.name);
		System.out.println("Balance : "+c1.account.balance);
		
		System.out.println("Clone Object");
		System.out.println("Name : "+c2.name);
		System.out.println("Balance : "+c2.account.balance);

	}

}
