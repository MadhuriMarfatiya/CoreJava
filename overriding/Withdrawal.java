package in.co.overriding;

public class Withdrawal extends Account {

	public int getAmount(String[] args) {

		int remianingBalance = super.getAmount() - Integer.parseInt(args[0]);
		return remianingBalance;
	}

}
