package entity;

public class Account {
	private int number;
	private String name;
	protected double balance;
	private final int TAXA = 5;
	
	public Account() {
	
	}
	
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	//	System.out.printf("Account data:\nAccount %d, Holder: %s, Balance: $ %.2f");
	}
	
	public Account(int number, String name, double amount) {
		this.number = number;
		this.name = name;
		this.balance = amount;
	//	System.out.printf("Account data:\nAccount %d, Holder: %s, Balance: $ %.2f");
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
		
	}
	
	public void withdraw(double amount) {
		balance -= amount + TAXA;
	}
	
	
	

}
