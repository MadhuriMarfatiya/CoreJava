package in.co.practice;

public class E4_14_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =2002;
		int r=0;
		int sum=0;
		int n=num;
		
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(num==sum) {
			System.out.println("num is palindrom");
		}
		else {
			System.out.println("num is not palindrom");
		}
	}}
	


