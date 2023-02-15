package in.co.array;

public class TwoDArrayTableFrom2to10 {
	public static void main(String[] args) {
		int[][] table;
		table = new int[11][11];
		for (int i = 1; i <= table.length-1; i++) {
			for (int j = 2; j <= table.length-1; j++) {
				table[i][j] = i * j;
			
				System.out.print(table[i][j]+"\t");
			}System.out.println();
		}
	}
}