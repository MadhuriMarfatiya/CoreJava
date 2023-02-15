package in.co.basics;

public class BreakStatementExample_labeledType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] table= {{1,2},{3,4},{5,6}};
		search: //define lable
			//iterate rows
			for (int[] row : table) {
				for(int n : row) {
					//check if num is even
				if(n%2==0) {
					System.out.println(n);
				//terminate loop from lable
					break search;
				}
				}
			}
	}}