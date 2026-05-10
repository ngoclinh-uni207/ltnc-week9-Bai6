package com.bank;

public class InvalidFundingAmountException extends Exception {
  public InvalidFundingAmountException(double amount) {
    super("Số tiền không hợp lệ: " + amount);
  }
}