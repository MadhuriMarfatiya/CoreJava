package in.co.basics;

public class E4_14_15_LargestNumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 230, 250, 67, 89, 56 };
		firstmethod(array);
	}

	public static void firstmethod(int array[]) {

		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println(max);
	}

}
