package in.co.exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class E7_3_1_CalculateAge {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
			
			Date d =new Date();
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		    Date birthdate =sdf.parse("28/03/1991");
		    		
			
		System.out.println("Today "+d);
		System.out.println("birthdate :"+birthdate);
	int age = d.getYear()-birthdate.getYear();
	System.out.println(age);
	}
}