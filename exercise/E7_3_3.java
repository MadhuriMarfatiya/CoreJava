package in.co.exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class E7_3_3 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
			
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
			Date startDate = sdf.parse(args[0]);
			Date EndDate = sdf.parse(args[1]);
			if(startDate.getTime()>EndDate.getTime()) {
				System.out.println("Error Message : Start date should not be lesser");
			}
			else if (startDate.getTime()==EndDate.getTime()) {
				System.out.println("start date and end date is same ");
			}
			else {
				System.out.println("EndDate should be higher than StartDate");
			}
	}

}
