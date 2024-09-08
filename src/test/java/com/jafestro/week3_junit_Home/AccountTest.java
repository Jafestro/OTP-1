package com.jafestro.week3_junit_Home;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AccountTest {
    @Test
    void testDeposit() {
        Account account = new Account();
        account.deposit(1000.0);
        assertEquals(1000.0, account.getBalance());
    }

    @Test
    void testGetBalance() {
        Account account = new Account();
        account.deposit(2000.0);
        account.withdraw(1500.0);
        assertEquals(500.0, account.getBalance());
    }

    @Test
    void testWithdraw() {
        Account account = new Account();
        account.deposit(100000.0);
        account.withdraw(5000.0);
        assertEquals(95000.0, account.getBalance());
    }
}
