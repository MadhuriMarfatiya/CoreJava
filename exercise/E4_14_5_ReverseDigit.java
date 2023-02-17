package in.co.exercise;

public class E4_14_5_ReverseDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=123;
		int reverse=0;
		while(num!=0) {
			int remainder = num%10;
			reverse = reverse*10 + remainder;
			num =num/10;
									}
		System.out.println("reverse digit is : "+reverse);
		

	}

}
