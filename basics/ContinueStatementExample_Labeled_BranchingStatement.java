package in.co.basics;

public class ContinueStatementExample_Labeled_BranchingStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//the continue statement skips the current iteration of a for,while or do-while loop.
		// a labeled continue statement skips the current iteration of an outer loop marked with the given label.
	//example that will print rows that contains all even numbers.
		
		int[][] table= {{1,2},{4,6},{3,5}};
		//iterate row values
		outerFor: for (int[] row : table) {
		for(int n : row) {
			//check if number is odd then go to next row
			if(n%2==1) {
				continue outerFor;
			}
		}
		//print row that has all even number
	System.out.println(row[0]+","+row[1]);
	}

}
}