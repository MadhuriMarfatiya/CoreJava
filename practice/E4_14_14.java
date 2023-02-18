package in.co.practice;

public class E4_14_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=5;
		int sum1=0;
		int sum2=0;
		float avg;
		for(int i=1;i<=num;i++) {
			
		
		if(num%2==0) {
			sum1=sum1+i;
			
		}else {
			sum2=sum2+i;
		}
		}
		 avg=(sum1+sum2)/2f;
		System.out.println(avg);
	}

}
