package models;

public class CarLoan extends Loan {

    public CarLoan(Customer customer, double amount, int termInYears) {
        super(customer, amount, termInYears);
    }

    @Override
    public double getInterestRate() {
        return 0.08;
    }

}
