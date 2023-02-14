package in.co.basics;

public class E4_14_17_MisingValueFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		int b[]= {10,20,30,40,50,100};
		int sum1=0,sum2=0;
		
		for(int i=1;i<a.length;i++) {
			sum1=sum1+a[i];
		}
		for(int j=1;j<b.length;j++) {
			sum2=sum2+b[j];
		}
		int misingValue= sum2-sum1;
		System.out.println("misiing value of array b[] is :"+misingValue);
		
	}

}
