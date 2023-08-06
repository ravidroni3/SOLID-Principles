package S.Good;

import S.Bad.AccountOperations;

import java.math.BigDecimal;

public class TransactionOperations {
    public void deposit(BigDecimal amount, int accountNumber){
        AccountOperations accountOperations = new AccountOperations();
        Account account = accountOperations.getAccount(accountNumber);
        account.setAmount(account.getAmount().add(amount));
    }


    public void withdraw(BigDecimal amount, int accountNumber){
        AccountOperations accountOperations = new AccountOperations();
        Account account = accountOperations.getAccount(accountNumber);
        account.setAmount(account.getAmount().subtract(amount));

    }
}
