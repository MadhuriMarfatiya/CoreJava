package in.co.variableAndOperators;

public class StringToOtherDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  String str ="500"; 
		  int i = Integer.parseInt(str); 
		  System.out.println(i);
		   
		//String str = "5.5";

		double d = Double.parseDouble(str);
		System.out.println(d);

		float f = Float.parseFloat(str);
		System.out.println(str);

		long l = Long.parseLong(str);
		System.out.println(l);

		String bstr = "True";
		System.out.println(bstr);

		boolean b = Boolean.getBoolean(bstr);
		System.out.println(b);
	}

}
