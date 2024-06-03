package Arithmatical_Exception;

public class Account {
	
	private int balance;
	
	public Account(int bal) {
		this.balance=bal;
	}
	public int getBalance() {
		return balance;
	}
	public  void withdraw(int amount) throws InsufficientException {
		
		if(balance<amount) {
			throw new InsufficientException("Insufficent balance..");
		}
		balance-=amount;
		
	}
	
}
