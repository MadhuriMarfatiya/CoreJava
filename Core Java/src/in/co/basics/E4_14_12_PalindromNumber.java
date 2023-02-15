package in.co.basics;

public class E4_14_12_PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=121;
int remainder=0;
int sum=0;
int n=num;

while(n>0) {
	remainder=n%10;
	sum= (sum*10)+remainder;
	n=n/10;
}
if (num==sum) {
	System.out.println("palindrom number");
	}
else {
	System.out.println("num is not palindrom");
}

	}}
