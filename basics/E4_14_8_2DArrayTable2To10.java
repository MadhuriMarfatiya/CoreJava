package in.co.basics;

public class E4_14_8_2DArrayTable2To10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]Table ;
		Table=new int[11][11];
		for (int i=1;i<Table.length;i++) {
			for (int j=2;j<Table.length;j++) {
				Table[i][j]=i*j;
				System.out.print(Table[i][j]+"\t");
			}System.out.println();
		}
		}
		
	}


