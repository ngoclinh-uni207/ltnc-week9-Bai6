package com.bank;

import com.bank.Account;
import com.bank.CheckingAccount;
import com.bank.InsufficientFundsException;
import com.bank.InvalidFundingAmountException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
  @Test
  void testDepositSuccess() throws Exception {
    Account account = new CheckingAccount(123, 1000);
    account.deposit(500);
    assertEquals(1500, account.getBalance());
  }

  @Test
  void testDepositFail() {
    Account account = new CheckingAccount(123, 1000);
    assertThrows(InvalidFundingAmountException.class, () -> account.deposit(-10));
  }

  @Test
  void testWithdrawSuccess() throws Exception {
    Account account = new CheckingAccount(123, 1000);
    account.withdraw(400);
    assertEquals(600, account.getBalance());
  }

  @Test
  void testWithdrawInsufficient() {
    Account account = new CheckingAccount(123, 500);
    assertThrows(InsufficientFundsException.class, () -> account.withdraw(1000));
  }
}