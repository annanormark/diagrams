package codeE1;

public class User {
	private String name;
	private AccountManagement bankAccount;
	private ContactInfo contactInfo;
	private LocalStatistics statistics;
	private int id;
	private LogIn logIn;

	public User(){
		bankAccount = new AccountManagement();
	}

	public ContactInfo getContactInfo(){
		return contactInfo;
	}

	public void createStatistics(){

	}
}
