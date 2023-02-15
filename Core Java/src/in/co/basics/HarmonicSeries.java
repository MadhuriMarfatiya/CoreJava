package in.co.basics;

public class HarmonicSeries {
	public static void main(String[] args) {
		 int num=5;
		 double result = 0;
		/*
		 * while(num > 0){ result = result + (double) 1 / num; num--; }
		 */
	for (int i=1; i<=num;i++) {
		System.out.print("1/"+i+" +");
		result = result + (double) 1 / i;
	}
	  System.out.println("\n\nOutput of Harmonic Series is "+result);
    }
	}
