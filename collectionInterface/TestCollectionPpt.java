package in.co.collectionInterface;

import java.util.ArrayList;

public class TestCollectionPpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList names=new ArrayList();
		for(int i=0;i<10;i++) {
			names.add("no # " +i);
		}
		System.out.println("names : "+names.size());
		Object o =names.get(4);
		String name=(String) o;
		System.out.println("First name is "+name);
		
		
	}

}
