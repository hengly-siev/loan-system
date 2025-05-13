package models;

public class Customer {
    private String name;
    private int age;
    private double annualIncome;

    public Customer(String name, int age, double annualIncome) {
        this.name = name;
        this.age = age;
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    

    
}
