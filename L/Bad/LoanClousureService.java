package L.Bad;

public class LoanClousureService {
    private LoanPayment loanPayment;

    public LoanClousureService(LoanPayment loanPayment) {
        this.loanPayment = loanPayment;

    }

    public void forCloseLoan() {
        loanPayment.forCloseLoan();
    }

}
