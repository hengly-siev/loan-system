package service;


import models.Loan;

public class StandardLoanCalculator implements LoanCalculator {

    @Override
    public double calculatorMonthlyPayment(Loan loan) {
        return loan.calculateMonthlyPayment();
    }
    
}
