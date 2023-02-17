package in.co.exercise;

import java.util.Calendar;
import java.util.Date;

public class E7_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		Calendar cal = Calendar.getInstance();
		for(int i =0;i<12;i++) {
			cal.add(Calendar.DATE, 30);
			
			System.out.println(cal.getTime());	
		}
		
	}

}
