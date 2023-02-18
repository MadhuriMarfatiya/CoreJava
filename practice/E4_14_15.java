package in.co.practice;

public class E4_14_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {230,240,220,340,450,210};
		firstmethod(array);
		
	}
		public static void firstmethod(int array[]) {
		
		int max=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println(max);
	}
	
}
