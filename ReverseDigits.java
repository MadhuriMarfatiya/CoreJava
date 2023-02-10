package in.co.basics;

public class ReverseDigits {
	public static void main(String[] args) {
		int number=1234;
		int reverse=0;
		while(number!=0) {
			int remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
			
		}
		System.out.println("reverse of a number is : "+reverse);
	}

}
