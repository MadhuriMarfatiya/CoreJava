package in.co.runTimeArguments;

public class Hello_All_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size = args.length;
		switch(size) {
		case 0:
			System.out.println("Usage : Java HelloAll n1 n2 n3...");
			break;
		case 1:
			System.out.println("Hello "+args[0]);
			break;
		default:
			for(int i=0;i<size;i++) {
				System.out.println(i+" = Hello "+args[i]);
			}
		}		
	}

}
