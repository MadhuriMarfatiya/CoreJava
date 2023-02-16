package in.co.objectOrientedProgramming;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Person p;
		p= new Person();
		p.setName("Madhuri");
		p.setDob("28/03/1991");
		p.setAddress("Indore");
		String fName = p.getName();
		String address=p.getAddress();
		
		int age =p.getAge();
		System.out.println(fName);
		System.out.println(address);
		System.out.println(p.getDob());
		
	}

}