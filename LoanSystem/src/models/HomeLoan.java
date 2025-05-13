package models;

public class HomeLoan extends Loan {

    public HomeLoan(Customer customer, double amount, int termInYears) {
        super(customer, amount, termInYears);
    }

    @Override
    public double getInterestRate() {
        return 0.06;
    }

}
