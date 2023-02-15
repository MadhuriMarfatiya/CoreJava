package in.co.basics;

public class E4_14_10_ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//given number is Armstrong or not
		// armstrong num means 1*1*1 + 5*5*5 +3*3*3 
		int num=153;
		int r ;
		int sum=0;
		int n = num;
		while(n>0) {
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(sum==num) {
			System.out.println("num is Armstrong");
		}
		else {
			System.out.println("num is not armstrong");
		}
	}

}
