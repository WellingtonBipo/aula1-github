package entities;

public class Client {
	
	private int numberAccount;
	private String name;
	private double balance;
	
	
	
	public Client() {
	}
	
	public Client(int numberAccount, String name) {
		super();
		this.numberAccount = numberAccount;
		this.name = name;
	}
	
	public Client(int numberAccount, String name, double balance) {
		super();
		this.numberAccount = numberAccount;
		this.name = name;
		this.balance = balance;
	}





	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	
	}
	public int getNunberAccount() {
		return numberAccount;
	}
	
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.00;
	}
	
	
	
	public String toString() {
		return "Account: "
				+ numberAccount
				+ ", Holder: "
				+ name
				+ ", Balance: $"
				+ String.format("%.2f", balance);
	}

}
