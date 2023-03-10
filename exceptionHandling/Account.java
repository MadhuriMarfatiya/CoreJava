package in.co.exceptionHandling;

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
		  setBalance(total);}
		  else {
			  try {
		  throw new AccountException();
		  }
			  catch(Exception e){
				  System.out.println(e);
			  }
			  }
		  }
		  
	public void fundTransfer(double amount) {
		 double total = getBalance() - amount;
		  if (total > 2000) {  
		  setBalance(total);
		  }
		  
		  else {
		  try {
			  throw new AccountException();
		  }catch(Exception e){
			  System.out.println(e);
		  }
	}
	}
	public void payBill(double amount) {
		 double total = getBalance() - amount;
		  
		  if (total > 2000) {
		  
		  setBalance(total);	  
		  }
		  else try{
			  throw new AccountException();
		  }catch(Exception e) {
			  System.err.println("insufficient fund");
				  
			  }
			
		 }
			}
