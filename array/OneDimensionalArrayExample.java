package in.co.array;

public class OneDimensionalArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int[] table; //declares an array of integers
			table =new int[10];//allocates memory for 10 integers
			//access element and assign a value
			table[0]=2;
			table[1]=4;
			table[2]=6;
			table[3]=8;
			table[4]=10;
			table[5]=12;
			table[6]=14;
			table[7]=16;
			table[8]=18;
			table[9]=20;
			//access 5th element of table
			int ele =table[4];
			System.out.println("5th Element : "+ele);

			// you can declare, initialize the java array together by following statements
			int[] i = {10,20,30};
			double[] d = {10.1,20.2,30.3};
			char[] ch = {'a','b','c'};
			
			int i1=i[2];//to get 3rd element 
			double d1=d[1];//to get 2nd element
			char c=ch[0];//to get 1st element of array
			System.out.println(i1);
			System.out.println(d1);
			System.out.println(c);
	}

}
