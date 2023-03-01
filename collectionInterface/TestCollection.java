package in.co.collectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {

	public static void main(String[] args) {
		
		Collection c =new ArrayList();  //creates a collection
		
		//add elements into collection
		c.add("Bura mat dekho");//index #0
		c.add("Bura mat suno");//index 1
		c.add("bura mat socho");//index 2
		
		System.out.println("Length of collection : "+c.size());
		
		//print all elements of collection
		for(Object ele : c) {
			System.out.println(ele);
		}
		
		//convert collection into array
		Object[] oArray=c.toArray();
		
		//print all elements of array
		for(Object ele : oArray) {
			String s=(String)ele;
			System.out.println(s);
		}
	}

}
