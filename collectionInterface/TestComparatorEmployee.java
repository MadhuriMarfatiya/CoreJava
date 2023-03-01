package in.co.collectionInterface;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparatorEmployee {

	public static void main(String[] args) {
		Comparator_Employee e1=new Comparator_Employee("ram", "indore", "28/03/1990");
		Comparator_Employee e2= new Comparator_Employee("ram", "ujjain", "28/03/1990");
		Comparator_Employee e3= new Comparator_Employee("balram", "indore", "26/03/1991");
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		
		ArrayList list =new ArrayList();
		list.add(e1);
		list.add(e2);
		list.add(e3);
	
		
		System.out.println("my list :");
		for(Object object: list) {
			System.out.println(object);
		}
		
		System.out.println();
		System.out.println();
		System.out.println("my list after sorting : ");
		
				Collections.sort(list);
				
				for(Object o:list) {
					System.out.println(o);
				}

		

	}

}
