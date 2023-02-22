package in.co.exceptionHandling;

public class TestArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k =0; int i=15;
		try {
			double div =i/k;
			System.out.println("Div is "+div); //this will not execute as we get exception is upper line then it will directly goes to catch block..
		}
		catch (ArithmeticException e){
			System.out.println("Divided by zero");
			
		}

	}

}
