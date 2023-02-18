package in.co.practice;

public class E4_14_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {21,22,25,23,24};
		int max=array[0];
		int slnumber=array[1];
		
		if(array[0]>array[1]) {
			max=array[0];
			slnumber=array[1];
		}
		else {
			max=array[1];
			slnumber=array[0];
		}
		for(int i=2;i<array.length;i++) {
			if(max<array[i]) {
			
				slnumber=max;
				max=array[i];
			}else if(slnumber<array[i]) {
				slnumber=array[i];
			}
			
		}
		System.out.println("max"+max);
		System.out.println("second large number:"+slnumber);

	}

}
