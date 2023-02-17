package in.co.basics;

import java.io.IOException;

import in.co.runTimeArguments.Add;
import in.co.runTimeArguments.Division;

public class CommandLineMenu {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int ch = System.in.read();//read data from keyboard
		System.out.println("Selected Char ASCII Code "+ch);
		if(ch=='A' || ch=='a') {
			Add.main(args);			
		}else if(ch=='D' || ch=='d'){
				Division.main(args);
	}else {
		System.out.println("Incorrect Choice ");
	}

}
}
