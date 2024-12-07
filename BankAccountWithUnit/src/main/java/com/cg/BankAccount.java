package com.cg;

public class BankAccount {
		 
		private double balance;
	 
		public BankAccount() {
			super();
			this.setBalance(0.0);
		}
	 
		public double getBalance() {
			return balance;
		}
	 
		public void setBalance(double balance) {
			this.balance = balance;
		}
	 
		public void deposite(double amount) {
			if (amount <= 0.0)
				throw new IllegalArgumentException("Deposite should be positve");
			balance += amount;
		}
	 
		public void withdraw(double amount) {
			if (amount <= 0.0)
				throw new IllegalArgumentException("Deposit must be positive");
			if (amount > balance)
				throw new IllegalArgumentException("Insufficient balance");
			balance = balance - amount;
		}
	 
}
