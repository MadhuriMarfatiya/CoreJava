package in.co.collectionInterface;

import java.util.ArrayList;
import java.util.Collections;

public class TestMarksheetSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList marksheets=new ArrayList();
		marksheets.add(new Marksheet("A4","Sakshi S",89));
		marksheets.add(new Marksheet("A2","P Sindhu",90));
		marksheets.add(new Marksheet("A3","Saina N",80));
		
		//sort elemets by Comparable
		Collections.sort(marksheets);
		//print all elements
		for(Object o:marksheets) {
			System.out.println(o);
		}
	}

}
