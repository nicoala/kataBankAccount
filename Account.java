package kataBankAccount;

import java.io.PrintStream;
import java.util.ArrayList;

public class Account {
	
	protected float balance;
	private ArrayList<Transaction> transactions;
	
	public Account(float balance){
		this.balance = balance;
		this.transactions = new ArrayList<Transaction>();
	}
	
	public void displayBalance() {
		PrintStream printer = System.out;
		printer.println("Balance : " + balance);
	}
	
	public void acountStatement() {
		for(Transaction transaction : transactions) {
			transaction.displayDate();
			transaction.display();
		}
		this.displayBalance();
	}
	
	public void accountTransaction(Transaction transaction) {
		this.displayBalance();
		transaction.display();
		transaction.operates(this);
		transactions.add(transaction);
		this.displayBalance();
	}
	
	public void transfer(String date, float value, Account receivingAccount) {
		Withdrawal withdraw = new Withdrawal(date, value);
		Deposit deposit = new Deposit(date, value);
		this.accountTransaction(withdraw);
		receivingAccount.accountTransaction(deposit);
	}
	
}
