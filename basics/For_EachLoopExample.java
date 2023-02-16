package in.co.basics;

import java.util.ArrayList;

public class For_EachLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {1,2,3,4,5,6,7,8,9,10};
		//iterate array elements
		for(int n: numbers) {
			System.out.println(n);
		}
		//print all elements of collection
		ArrayList<String> names= new ArrayList<String>();
		names.add("one");
		names.add("two");
		
		for(String n : names) {
			System.out.println(n);
		}
	
	}

}
