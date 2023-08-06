package L.Good;

public class LoanClousureService {
    private SecureLoan secureLoan;

    public LoanClousureService(SecureLoan secureLoan) {
        this.secureLoan = secureLoan;

    }

    public void forCloseLoan() {
        secureLoan.forCloseLoan();
    }

}
