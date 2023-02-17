package in.co.runTimeArguments;

public class Hello_Name_If_Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length==1) {
			System.out.println("Hello "+args[0]);
		}else
		{
			System.out.println("Parameter name is required");
		}
	}

}
