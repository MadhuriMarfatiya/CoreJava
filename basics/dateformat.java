package in.co.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateformat {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String str= sdf.format(d);
		System.out.println("date :"+str);
		
		String str1 = "09/02/2023";
		Date d1 = sdf.parse(str1);
		System.out.println(d1);
		
	}

}
