package in.co.practice;

public class E4_14_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		for(int i=101;i<200;i++) {
			if(i%7==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
