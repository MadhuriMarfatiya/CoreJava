package in.co.exceptionHandling;
/*-A catch block of parent class can handle exception of its sub classes.
it can be used as a generic catch to handle multiple exceptoins in down hierarchy.
for example:
	catch(child comes first) {}
	catch(parent comes later Exception e) {}
	
-Catch block of a child class must come first in the order,if parent's class catch does not exists.
*/

public class CatchBLockParentChild {

	public static void main(String[] args) {

		String name="vijay";
		try {
			System.out.println("length of name is :"+name.length());
			System.out.println("character at 7 position is :"+name.charAt(6));
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("String abhi chhoti hai");
		}catch(RuntimeException e) {
			System.out.println("Error "+e.getMessage());
		}
	}

}
