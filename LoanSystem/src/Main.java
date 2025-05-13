import models.Customer;
import models.Loan;
import models.PersonalLoan;
import service.LoanProcessor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            // 1) Call your constructor with plain args
            Customer hengly = new Customer("Hengly Siev", 35, 50_000);

            // 2) Same for your PersonalLoan constructor
            Loan personalLoan = new PersonalLoan(hengly, 1_000, 5);

            LoanProcessor processor = new LoanProcessor();

            if (processor.approveLoan(hengly, personalLoan)) {
                processor.processLoan(personalLoan);
            } else {
                // 3) Plain string literal
                System.out.println("Loan Rejected");
            }
        }
}