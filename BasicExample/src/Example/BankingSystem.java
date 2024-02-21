package Example;

import java.util.HashMap;
import java.util.Map;

class Account {

	public static int nextAccountNumber = 1000;
	private int accountNumber;
	private String accountHolder;
	private double balance;

	public Account(String accountHolder, double balance) {
		super();
		this.accountNumber = nextAccountNumber++;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public static int getNextAccountNumber() {
		return nextAccountNumber;
	}

	public static void setNextAccountNumber(int nextAccountNumber) {
		Account.nextAccountNumber = nextAccountNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {

		balance = balance + amount;

		System.out.println("Deposit sucessfully. new balance is: " + balance);
		// System.out.println(" ");
	}

	public void withdrawal(double amount) {
		if (amount > balance) {
			System.out.println(" ");
			System.out.println(".......................Withdraw Section...................");
			System.out.println("insufficiant balance....");
		} else {
			balance = balance - amount;

			System.out.println("withdrawal sucessfull. new balance is : " + balance);
			System.out.println(" ");
		}

	}
}

public class BankingSystem {
	private static Map<Integer, Account> accounts = new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1 = new Account("Tejas", 5000.00);
		Account account2 = new Account("Nithin", 10000.00);

		accounts.put(account1.getAccountNumber(), account1);
		accounts.put(account2.getAccountNumber(), account2);

		account1.deposit(500.0);
		account2.deposit(1000.0);

		account1.withdrawal(111700);
		account1.withdrawal(700);

		System.out.println("The account 1 details");
		System.out.println("..................... ");
		System.out.println("Account number is : " + account1.getAccountNumber());
		System.out.println("Account Holder Nmae : " + account1.getAccountHolder());
		System.out.println("Account 1 balance is : " + account1.getBalance());
		System.out.println(" ");

		System.out.println("The account 2 details");
		System.out.println(".......................");
		System.out.println("Account number is : " + account2.getAccountNumber());
		System.out.println("Account Holder Nmae : " + account2.getAccountHolder());
		System.out.println("Account 2 balance is : " + account2.getBalance());

	}

}
