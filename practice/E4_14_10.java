package in.co.practice;

public class E4_14_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=153;
		int r;
		int count=0;
		int n=num;
		while(n>0) {
			r=n%10;
			count=count+(r*r*r);
			n=n/10;
		}
		if(count==num) {
			System.out.println("num is armstrong");
			
		}
		else {
			System.out.println("num is not armstrong");
		}
	}
}

