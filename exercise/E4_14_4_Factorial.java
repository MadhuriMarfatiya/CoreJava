package in.co.exercise;

public class E4_14_4_Factorial {
	public static void main(String[] args) {
		int number=5;
		int fact=1;
		for (int i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("fact of number :"+fact);
	}

}
