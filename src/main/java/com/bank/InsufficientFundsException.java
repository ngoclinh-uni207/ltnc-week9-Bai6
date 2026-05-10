package com.bank;

public class InsufficientFundsException extends Exception {
  public InsufficientFundsException(double amount) {
    super("Số dư không đủ");
  }
}