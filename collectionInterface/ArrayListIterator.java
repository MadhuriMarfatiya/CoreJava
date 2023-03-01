package in.co.collectionInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

		public static void main(String[] args) {
			ArrayList v= new ArrayList();
		v.add("one");
		v.add("two");
		v.add("Three");
		int size=v.size();
		Iterator it=v.iterator();//gets an iterator
		while(it.hasNext()) {
			Object o=(Object)it.next();
			System.out.println(o);
		}
		

	}

}
