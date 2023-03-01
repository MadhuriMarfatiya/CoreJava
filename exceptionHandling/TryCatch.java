package in.co.exceptionHandling;

public class TryCatch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		try {
			int a =6;
			int b=6;
			int c =a/b;
			System.out.println(c);
			
			try {int i=6;
			int j=0;
			int k =i/j;
			System.out.println(k);
			}catch(Exception e){
			System.out.println(e);
			}
			finally {System.out.println("always runs..");}
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
		finally {System.out.println("always runs");
	}

}
}