package in.co.objectOrientedProgramming;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	private String name=null;
	private Date dob=null;
	private String address =null;
	public static final int avg_age=18;
	
	SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	public String getAddress() {
		return address;
}
	public void setDob(String date) throws ParseException {
		dob =sdf.parse(date);
	}
	public String getDob() {
		String s1=sdf.format(dob);
		return s1;
	}
	public int getAge() {
		return avg_age;
	}
}