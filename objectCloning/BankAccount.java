package in.co.objectCloning;

public class BankAccount implements Cloneable{
public double balance=0;

public BankAccount(double b) {
	balance=b;
}
public Object Clone() throws CloneNotSupportedException {
	return super.clone();
}
}
