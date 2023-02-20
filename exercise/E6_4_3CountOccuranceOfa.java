package in.co.exercise;

public class E6_4_3CountOccuranceOfa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "vijay Chauhan";
		char a='a';
		int sum=0;
		
			for (int i = 0; i < name.length(); i++) {
			//System.out.println(name.charAt(i));	
			if(name.charAt(i)==a) {
				sum++;
			}
			}System.out.println(sum);
	}
}
