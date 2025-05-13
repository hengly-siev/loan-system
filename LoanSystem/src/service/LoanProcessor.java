package service;


import models.Customer;
import models.Loan;

public class LoanProcessor {
    public boolean approveLoan(Customer customer, Loan loan) {
        if (customer.getAnnualIncome() < 20000) return false;
        if (loan.getAmount() > customer.getAnnualIncome() * 5) return false;
        return true;
    }

    public void processLoan(Loan loan) {
        LoanCalculator calculator = new StandardLoanCalculator();
        double monthly = calculator.calculatorMonthlyPayment(loan);
        System.out.printf("Loan Approved for %s. Monthly Payment: %.2f%n",
        loan.getCustomer().getName(), monthly);
    }
}
