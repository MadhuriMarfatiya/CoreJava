package in.co.basics;

public class PrimeNumber {
	public static void main(String[] args) {
		int number = 5, m = 0;

		for (int i = 2; i <= number - 1; i++) {

			if (number % i == 0) {
				m = m + 1;
			}
		}
		if (m == 0) {

			System.out.println("number is prime");
		} else {
			System.out.println("number is not prime");
		}
	}
}
