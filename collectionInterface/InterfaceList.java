package in.co.collectionInterface;

import java.util.ArrayList;
import java.util.List;

public class InterfaceList {

	public static void main(String[] args) {
		List a=new ArrayList();
		//a.add(5,333);
		System.out.println("to add : "+a.add("madhuri"));// madhuri added to arraylist a
		System.out.println("to add :"+a.add("aaa"));// aaa added to arraylist a 
		System.out.println("to add : "+a.add("xyz"));//xyz added to arraylist a 
		System.out.println("to add : "+a.add("bbb"));//bbb added to arraylist a
		System.out.println("to get element :"+a.get(0));// will show element on index 0
		System.out.println("to remove : "+a.remove(1));//will remove element on index 1
		System.out.println("set used to replaces the i-th element with o :"+a.set(0, "abc"));// will update or edit element on 0 index by abc
		System.out.println(a.get(0));// will show elemnt on index 0 updated by set method o/p will be abc
		System.out.println(a.add("rrr"));
		System.out.println(a.add(123));
		System.out.println("searches object from begining "+a.indexOf("xyz"));
		System.out.println("searches object from end : "+a.lastIndexOf("xyz"));
		System.out.println("returns sublist:"+a.subList(0, 1));
		System.out.println(a.get(0));
		

	}

}
