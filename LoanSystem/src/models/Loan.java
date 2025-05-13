package models;

public abstract class Loan {
    protected Customer customer;
    protected double amount;
    protected int termInYears;


    public Loan(Customer customer, double amount, int termInYears) {
        this.customer = customer;
        this.amount = amount;
        this.termInYears = termInYears;
    }

    public abstract double getInterestRate();

    public double calculateMonthlyPayment() {
        double monthlyRate = getInterestRate() / 12;
        int months = termInYears * 12;
        return (amount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -months));
    }


    public Customer getCustomer() {
        return customer;
    }


    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public double getAmount() {
        return amount;
    }


    public void setAmount(double amount) {
        this.amount = amount;
    }


    public int getTermInYears() {
        return termInYears;
    }


    public void setTermInYears(int termInYears) {
        this.termInYears = termInYears;
    }

        
}
