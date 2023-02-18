package in.co.practice;

public class E4_14_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=15;
		
		int m=0;
		for(int i=2;i<num-1;i++) {
			if(num%i==0) {
			
				m++;
			}
		}
		if(m==0) {
			System.out.println("num is prime");
		}
		else {
			System.out.println("num is not prime");
		}
	}

}
