package com.bank;

/**
 * Lop truu tuong dai dien cho tai khoan ngan hang.
 */
public abstract class Account {
  protected long accountNumber;
  protected double balance;
  // Day la dong code de test cache cho bai 6
  public Account(long accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public double getBalance() {
    return balance;
  }

  public void deposit(double amount) throws InvalidFundingAmountException {
    if (amount <= 0) {
      throw new InvalidFundingAmountException(amount);
    }
    balance += amount;
  }

  public abstract void withdraw(double amount) throws Exception;
}