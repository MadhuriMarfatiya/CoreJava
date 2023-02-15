package in.co.array;

public class CopyArrayElementsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] copyFrom= {'M','A','D','H','U','R','I'};
		char[] copyTo= new char[5];
		System.arraycopy(copyFrom, 2, copyTo, 0, 5);
		System.out.println(copyTo);
	}

}
