package entity;

public class SavingsAccount extends Account {
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(int number, String name, double amount, Double interestRate) {
		super(number, name, amount);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}	

}
