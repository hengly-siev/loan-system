package models;

public class PersonalLoan extends Loan {

    public PersonalLoan(Customer customer, double amount, int termInYears) {
        super(customer, amount, termInYears);
    }

    @Override
    public double getInterestRate() {
        return 0.10;
    }

}
