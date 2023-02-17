package in.co.exercise;

public class E4_14_8_2DArrayTable2To10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]table ;
		table=new int[11][11];
		for (int i=1;i<table.length;i++) {
			for (int j=2;j<table.length;j++) {
				table[i][j]=i*j;
				System.out.print(table[i][j]+"\t");
			}System.out.println();
		}
		}
		
	}


