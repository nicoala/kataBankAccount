package kataBankAccount;

import java.io.PrintStream;

public class Deposit extends Transaction {

	public Deposit(String date, float value) {
		super(date, value);
	}

	@Override
	public void display() {
		PrintStream printer = System.out;
		printer.println("+ " + value + " $");
	}

	@Override
	public void operates(Account account) {
		account.balance += value;
	}
	
}
