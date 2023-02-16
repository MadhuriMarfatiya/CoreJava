package in.co.StringClass_StringBufferClass;

/****
 * StringBuffer and StringBuilder***
 * 
 * The StringBuffer class is used to create mutable (modifiable) String. the
 * StringBuffer class is same as String except it is mutable i.e. it can not be
 * changed.
 *** 
 * String vs StringBuffer*** - String is immutable -- memory object can not be
 * changed. - StringBuffer is mutable. -- memory object can be changed.
 * 
 * Few key methods of StringBuffer are... -append(String s) -insert(int index,
 * String s) -delete(int StartIndex,int EndIndex) -reverse() -int capacity()
 */	
/*	*** String Builder***
	The StringBuilder Class is same as StringBuffer except that is non sychronized. it is available since JDK1.5.
	
	*** StringBuffer vs StringBuilder ***
		- StringBuffer
			--Synchronous
			--Thread Safe
			--Used in multi-user system
		- StringBuilder
			--Asynchronous
			--Not Thread Safe
			--Used in Single User System
*/
public class StringBufferClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb=new StringBuffer("Vijay");
		sb.append("Dinanath Chauhan");
		
		System.out.println("Length : "+sb.length());
		//shows length of string
		
		System.out.println("Capacity: "+sb.capacity());
		//shows capacity of string that holds characters
		
		System.out.println("Char at : "+sb.charAt(1));
		//shows on which character is on 1st index 
		
		System.out.println("Index Of : "+sb.indexOf("Dinanath"));
		//Index of from where Dinananth Starts
		
		System.out.println("Replace: "+sb.replace(0, 5, "Jay"));
		//replace jay with starting index 0 to 5. 
		
		System.out.println("Reverse: "+sb.reverse());
		//Reverse string. 
		
	}

}
