package codeE1;

public class AccountManagement {
	private int accountNumber;
	private User owner;

	public AccountManagement(){}

	public Boolean addMoney(int money){
		return true;
	}

	public Boolean makePayment(int money){
		return true;
	}

	public User getOwner() {
		return owner;
	}

	public int getAccountNumber(){
		return accountNumber;
	}
}
