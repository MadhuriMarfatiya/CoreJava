package in.co.objectOrientedProgramming;

public class Account {

	private String number = null;
	private String accountType = null;
	private Double balance = null;

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setAccounType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance = getBalance() + amount;

	}

	public void withdrawal(double amount) {

		
		  double total = getBalance() - amount;
		  
		  if (total > 2000) {
		  
		  setBalance(total);
		  
		  //System.out.println("Balance after withdrawl = " + total);
		  
		  }
		  
		  else {
		  
		  System.out.println("Insufficient balance...you can not withdraw!!");
		  
		 }}

	public void fundTransfer(double amount) {
		//balance = getBalance() - amount;
		 double total = getBalance() - amount;
		  
		  if (total > 2000) {
		  
		  setBalance(total);
		  
		  //System.out.println("Balance after withdrawl = " + total);
		  
		  }
		  
		  else {
		  
		  System.out.println("Insufficient balance...you can not Transfer!!");
		  
		 }
	}

	public void payBill(double amount) {
		 double total = getBalance() - amount;
		  
		  if (total > 2000) {
		  
		  setBalance(total);
		  
		  //System.out.println("Balance after withdrawl = " + total);
		  
		  }
		  
		  else {
		  
		  System.out.println("Insufficient balance...you can not withdraw!!");
		  
		 }
		//balance = getBalance() - amount;
	}

}
