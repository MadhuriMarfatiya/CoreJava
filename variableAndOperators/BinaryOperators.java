package in.co.variableAndOperators;

public class BinaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result, val1, val2;
		result=(val1=1)+(val2=2);
		System.out.println("val1 = "+val1);
		System.out.println("val2 = "+val2);
		System.out.println("result = "+result);
		
		// other example 
		
		float result1;
		int i,j;
		i=25; j=10;
		result1=(float)i/j;
		System.out.println("value of i "+i);
		System.out.println("value of j "+j);
		System.out.println("result1 : "+result1);
	
		// Compound operators provide a convenient shorthand.
		// example 
		int k=0;
		k=k+5; //0+5=5
		k+=5; //5+5=10
		System.out.println(k);// value of 10 will be 10
	
		// binary operators can be relational and logical
		//*** Relational Binary Operators are: 
		//  > : Less than
		//  < : Greater than
		// => : Less than or equal to
		// =< : Greater than or equal to
		// == : Equal to
		// != : Not Equal to 
		
		//*** Logical Binary Operators are:
		// && : Logical AND 
		// || : Logical OR
		
		int l =0;
		System.out.println("Test : "+((2<3) && (0<l++)));
		System.out.println("Test : "+((2<3) || (0<l++)));
		System.out.println("T:"+l);
	}

}
