package in.co.exceptionHandling;

public class TestLogin {

	public static void main(String[] args) {
		String name="adin";
		if(name.equals("admin")) {
			System.out.println("valid user");
		}else try{
			throw new LoginException();
		}catch(Exception e){
			System.out.println(e);
		}
				
	}

}
