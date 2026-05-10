package com.bank;

public class CheckingAccount extends Account {
  public CheckingAccount(long accountNumber, double balance) {
    super(accountNumber, balance);
  }

  @Override
  public void withdraw(double amount) throws Exception {
    if (amount <= 0) throw new InvalidFundingAmountException(amount);
    if (amount > balance) throw new InsufficientFundsException(amount);
    balance -= amount;
  }
}