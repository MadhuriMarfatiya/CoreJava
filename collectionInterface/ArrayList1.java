package in.co.collectionInterface;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList v= new ArrayList();
	v.add("one");
	v.add("two");
	v.add("Three");
	int size=v.size();
	for(int i=0;i<v.size();i++) {
		System.out.println(i+ " : "+v.get(i));
	}
	
		
	

	}

}
