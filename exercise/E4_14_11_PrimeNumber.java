package in.co.exercise;

public class E4_14_11_PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=5;
int m=0;//m for modulus
 
for(int i=2; i<=num-1;i++) {
	if(num%i==0) {
		m=m+1;
		}}
	if(m==0) {
		System.out.println("num is prime ");
	}
	else {
		System.out.println("num is not prime");
	}
}

	}


