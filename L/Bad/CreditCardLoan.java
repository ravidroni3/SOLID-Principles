package L.Bad;

public class CreditCardLoan implements LoanPayment {
    @Override
    public void doPayment(int amount) {
        throw new UnsupportedOperationException("for closure not allowed");
    }

    @Override
    public void forCloseLoan() {

    }

    @Override
    public void doRepayment(int amount) {
        throw new UnsupportedOperationException("do repayment not allowed");
    }
}
