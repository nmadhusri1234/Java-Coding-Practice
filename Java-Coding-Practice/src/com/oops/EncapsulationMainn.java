package com.oops;

 class BankAccount {

	private int accountNumber;
	private int balance;
	
	public void setBalance(int balance)
	{
		this.balance=balance;
	}
	public int getBalance()
	{
		return balance;
	}
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	public int getAccountNumber()
	{
		return accountNumber;
	}
	public void deposit(int amount) {
		if(amount>0)
		{
			balance+=amount;
		}
	}
	public void withdraw(int amount)
	{
		if(amount>0 && amount<=balance) {
			balance = balance-amount;
		}
	}
	
}
 public class EncapsulationMainn
{
	public static void main(String[] args) {
		
		BankAccount b = new BankAccount();
		b.setAccountNumber(123);
		b.setBalance(1000);
		b.deposit(500);
		b.withdraw(400);
		System.out.println(b.getBalance());
		
	}
}
