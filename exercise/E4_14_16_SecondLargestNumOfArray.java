package in.co.exercise;
public class E4_14_16_SecondLargestNumOfArray {
	public static void main(String[] args) {
		int array[]= {25,26,29,30,32};
		int max=array[0];
		int slarge=array[1];
		
		if(array[0]>array[1]) {
			max=array[0];
			slarge=array[1];
		}else {
			max=array[1];
			slarge=array[0];
		}
		for(int i=2;i<array.length;i++) {
			if(max<array[i]) {
				slarge=max;
				max=array[i];
				}
			else if(slarge<array[i]) {
				slarge=array[i];
			}
		}
		System.out.println("max of array is :"+max);
		System.out.println("second large of array is :"+slarge);
		
	}

}
