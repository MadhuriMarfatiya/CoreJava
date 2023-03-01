package in.co.collectionInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIneterfaceMethods {

	public static void main(String[] args) {
		
		  ArrayList a=new ArrayList(); a.add("A"); a.add("B"); a.add("c");
		 
		
		ArrayList c=new ArrayList();
		  System.out.println("names : "+c.add("madhuri"));
		  System.out.println(c.get(0));
		  System.out.println("names : "+c.add("xyz"));
		  System.out.println(c.get(1));
		  System.out.println("names are : "+c.addAll(a));
		  System.out.println(c.get(2));
		c.clear();
		System.out.println("names:"+c.add("abc"));
		System.out.println(c.get(0));
		System.out.println("names : "+c.add("def"));
		System.out.println("name collection : "+c.addAll(c));
		System.out.println("checks if already member is there or not: "+c.contains("abc"));
		System.out.println("contains all : "+c.containsAll(c));
		System.out.println("is empty or not:"+c.isEmpty());
		System.out.println(c.get(0));
		//System.out.println((iterator)c.iterator());
		System.out.println(c.remove("abc"));
		System.out.println(c.removeAll(c));
		//System.out.println(c.get(0));
		System.out.println(c.retainAll(c));
		//System.out.println(c.get(1));
		System.out.println(c.size());
	
	}

}
