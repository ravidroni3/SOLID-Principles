package S;

import S.Bad.AccountOperations;
import S.Good.Account;
import S.Good.TransactionOperations;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountName("Ajay");
        account.setAccountNumber(213123424);
        account.setAmount(BigDecimal.valueOf(1000));
        AccountOperations accountOperations = new AccountOperations();
        accountOperations.addAccount(account);

        TransactionOperations transactionOperations = new TransactionOperations();
        transactionOperations.deposit(BigDecimal.valueOf(1000), 25636);
    }
}
