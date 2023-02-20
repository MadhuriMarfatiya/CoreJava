package in.co.practice;

public class E4_14_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {22,23,24,25,26};
		int[] b= {22,23,24,25,26,27};
		int sum1=0;
		int sum2=0;
		int misingValue;
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		for(int j=0;j<b.length;j++) {
			sum2=sum2+b[j];
		}
		misingValue=sum2-sum1;
		System.out.println(misingValue);
	}

}
