package kataBankAccount;

import java.io.PrintStream;

public abstract class Transaction {
	
	protected String date;
	protected float value;
	
	public Transaction (String date, float value) {
		this.date = date;
		this.value = value;
	}
	
	public void displayDate(){
		PrintStream printer = System.out;
		printer.print(date+" : ");
	}
	
	public abstract void display();
	public abstract void operates(Account account);

}
