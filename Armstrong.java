package in.co.basics;

import javax.sound.midi.Soundbank;

public class Armstrong {
	public static void main(String[] args) {
		int num =153;
		
		int r ;
		int sum=0;
		int n=num;
		while(n>0) {
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
			
		}
		if(sum==num) { 
			System.out.println("Armstrong Number");
		}
	else {
		System.out.println("It's not Armstrong Number");
	}
	}
}
