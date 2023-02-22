package in.co.exceptionHandling;

/*more than one exception could be raised by a single try block.
 * To handle this type of situation , you can specify two or more catch blocks.*/

public class MultipleCatch {

	public static void main(String[] args) {
	String name=null;
	try {
		System.out.println("length of name is: "+name.length());
		System.out.println("Character at 7 position :"+name.charAt(6));
	}catch(StringIndexOutOfBoundsException e){
		System.out.println("string abhi chhoti hai");
	}catch(NullPointerException e) {
		System.out.println("name should not be blank");
	}
	finally {
		System.out.println("always runs...");
	}
	
	}

}
