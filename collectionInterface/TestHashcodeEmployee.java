package in.co.collectionInterface;

import java.util.ArrayList;


public class TestHashcodeEmployee {

	public static void main(String[] args) {
		Hashcode_Employee e1=new Hashcode_Employee("lakhan", "indore");
		Hashcode_Employee e2=new Hashcode_Employee("lakhan", "ujjain");
		Hashcode_Employee e3=new Hashcode_Employee("Shyam", "indore");
		Hashcode_Employee e4=new Hashcode_Employee("ram", "indore");
		Hashcode_Employee e5=new Hashcode_Employee("balram", "indore");
		
		System.out.println(e1.equals(e2));//checks weather name and address both are equal of e1 and e2
		System.out.println(e1.hashCode());//generates hashcode of name of Employee1
		System.out.println(e2.hashCode());//generates hashcode of name of Employee2
		
		ArrayList list =new ArrayList();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		System.out.println("my list :");
		for(Object object: list) {
			System.out.println(object);
		}
		
		

	}

}
