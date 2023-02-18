package in.co.practice;

public class E4_14_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=123;
		int m=0;
		int reverse=0;
		
		while(num>0) {
			m=num%10;
			reverse=reverse*10+m;
			num=num/10;
		}
		System.out.println(+reverse);
	}

}
