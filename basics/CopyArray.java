package in.co.basics;

public class CopyArray {
	public static void main(String[] args) {
		char[] copyFrom = {'d','e','f','g','d','f','g','h','d','f'};
		char[] copyTo = new char[7];
		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		System.out.println(new String(copyTo));
	}

}
