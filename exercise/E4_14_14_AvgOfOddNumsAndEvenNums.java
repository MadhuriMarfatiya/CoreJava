package in.co.exercise;

public class E4_14_14_AvgOfOddNumsAndEvenNums {
public static void main(String[] args) {
	int sum1=0;
	int sum2=0;
	float f;
	for(int i=0;i<=5;i++) {
		if (i%2==0) {
			sum1=sum1+i;
			System.out.println("sum of even numbers: "+sum1);
		}
		if(i%2!=0) {
			sum2=sum2+i;
			System.out.println("sum of odd numbers:"+sum2);
		}
		
	}
	f=(sum1+sum2)/2f;
	System.out.println("avarage of odd and even numbers"+f);
}
}
