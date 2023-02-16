package in.co.StringClass_StringBufferClass;

import java.util.Objects;

/*	strings are supported by a built in class named String
	(java.lang.String).
	String literals are supported by Java as special Case.
*/
/*
String is immutable.
String objects are immutable that means once a string object is created its value cannot be changed.
if you change the value the new string object will be created. 

Immutable Object: An object whose state can not be changed after its creationis called immutable object.
	String, Integer, Float, Short,Byte and all other wrapper classes' objects are immutable.
	objects those state can be changed are called mutable Objects.class

an immutable class can be created by following steps:
	
	1. make class final so that child class cannot be made.
	2. make all attributes private and final. 
	3. Define parameterized Constructor to initialize final attributes. 
	4. Define only getter methods to fetch the attributes. 
*/


public class StringClass {

	public static void main(String[] args) {
		


		String name="Vijay Dinanath Chauhan";
		
		System.out.println("String Length :"+name.length());
		//name of length 
		
		System.out.println("7th character is:"+name.charAt(6));
		//7th character of the string
		
		System.out.println("Dina index is:"+name.indexOf("Dina"));
		//Index of Dina shows
		
		System.out.println("First i Position:"+name.indexOf("i"));
		//first position of i in string 
		
		System.out.println("Last i position: "+name.lastIndexOf("i"));
		//last position of i in string
		
		System.out.println("a is replaced by b :"+name.replace("a", "b"));
		// first a in string is replaced by b 
		
		System.out.println("All a is replaced by b :"+name.replaceAll("a", "b"));
		//replace all a in string by b 
		
		System.out.println("make string in lower case : "+name.toLowerCase());
		//make whole string in lower case
		
		System.out.println("make string in upper case:"+name.toUpperCase());
		//make whole string in upper case
		
		System.out.println("starts with Vijay:"+name.startsWith("Vijay"));
		//show weather name starts with vijay or not - true / false
		
		System.out.println("End with han: "+name.endsWith("han"));
		//show weather name ends with han or not - true/false
		
		System.out.println("Substring :"+name.substring(6));
	// split string at char 7 or index 6 
	}

}
