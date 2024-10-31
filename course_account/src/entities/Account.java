package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double initalDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initalDeposit);
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account " + this.number + ", " + "Holder: " + this.holder + ", " + "Balance: $ "
				+ String.format("%.2f", this.balance);
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		this.balance -= amount + 5.0;
	}

}
