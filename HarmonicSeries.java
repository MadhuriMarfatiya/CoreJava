package in.co.basics;

public class HarmonicSeries {
	public static void main(String[] args) {
		 int num=5;
		 double result = 0;
	        while(num > 0){
	            result = result + (double) 1 / num;
	            num--;
	        }
	        System.out.println("Output of Harmonic Series is "+result);
	    }
	}