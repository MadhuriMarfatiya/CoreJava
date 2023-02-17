package in.co.exercise;

public class E4_14_13_HarmonicSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		double sum=0;
		while (num>0) {
			sum =sum + (double)1 / num;
			num--;
		}
		System.out.println("Harmonic Series of num is "+sum);
	}

}
