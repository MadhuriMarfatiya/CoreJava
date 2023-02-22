package in.co.exceptionHandling;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a=new Account();
		a.setNumber("0000123456789");
		a.setBalance(2000.00);
		a.setAccounType("Savings account");
		String num=a.getNumber();
		a.getBalance();
		String accountType=a.getAccountType();
		System.out.println("Account num is : "+num);
		System.out.println("Account Type is : "+accountType);
		System.out.println("Balance is : "+a.getBalance());
		a.deposit(1000);
		System.out.println("balance after deposit : "+a.getBalance());
		a.withdrawal(500);
		System.out.println("Balance after withdrawal: "+a.getBalance());
		a.fundTransfer(500);
		System.out.println("Balance after Fund transfer: "+a.getBalance());
		a.payBill(200);
		System.out.println("Balance after paybill : "+a.getBalance());
		
		
	
	}
}
