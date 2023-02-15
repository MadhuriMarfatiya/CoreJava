package in.co.basics;

public class ContinueStatementExample_Unlabeled_BranchingStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//The continue statement skips the current iteration of a for,while or do-while loop
//The Unlabled form skips to the end of the innermost loop's body and evaluates the boolean expression that controls the loop
//syntax : 
		//continue;
		//continue lable;
//example that prints all even numbers from an array
		int[] numbers = {1,2,3,4,5};
		//iterate array elements
		for(int n : numbers) {
			//check if num is odd then
			//skip rest statements
			if(n%2>0) {
				continue;
			}
			System.out.println(n);
		}
	}

}
