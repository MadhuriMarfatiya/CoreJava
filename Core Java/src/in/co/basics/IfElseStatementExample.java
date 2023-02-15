package in.co.basics;

public class IfElseStatementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print grade of a student on the basis of his marks
		int marks=80;
		if(marks>=90) {
			System.out.println("Grade A");
		}
		else if(marks>=80) {
			System.out.println("Grade B");
		}
		else if (marks>=70) {
			System.out.println("Grade c");
		}
		else {
			System.out.println("Grade D");
		}
		
	}

}
