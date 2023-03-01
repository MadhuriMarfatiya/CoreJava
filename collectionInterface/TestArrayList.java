package in.co.collectionInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("zero");//index 0
		l.add("one");//index 1
		l.add("two");//index 2
		l.add("Three");//index 3
		l.add("Five");//index 4
		
		l.add(4,"four");//insert at index4
		//Get an element by index
		String val=(String) l.get(1);
		System.out.println("value at index 1: "+val);
		
		//print all elements
		for(Object ele : l) {
			String str=(String) ele;
			System.out.println(str);
			
			//sort the list
			Collections.sort(l);
			System.out.println(l);
			
			//Create a sublist
			ArrayList sublist =new ArrayList(l.subList(1, 3));
			System.out.println(sublist);
			
			//convert to array
			Object[] nums=l.toArray();
		}
	}
}
