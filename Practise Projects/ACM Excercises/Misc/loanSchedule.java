
import java.util.Scanner;


public class loanSchedule {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int loan_amount,years,annual_interest_rate;
        
        double monthly_payment,total_payment;

        System.out.println("Loan amount:");
        loan_amount = scanner.nextInt();
        System.out.println("Number of years:");
        years = scanner.nextInt();

            int months = years * 12;

        System.out.println("Annual interest rate:");
        annual_interest_rate = scanner.nextInt();

        System.out.println("Monthly payment:");
        monthly_payment = scanner.nextDouble();
        total_payment = monthly_payment * months;

        double balance = (double)loan_amount;

       //variables for calculations
            double monthly_interest_rate = annual_interest_rate / (double)(months * 100);
            double monthly_interest;
            double principal;

        System.out.println("Payment#   Interest  Principal  Balance");
             
            for(int i = 0; i < 12; i++){

                monthly_interest = monthly_interest_rate * balance; 
                principal = monthly_payment - monthly_interest;

                balance -= principal;

                System.out.println((i + 1) + monthly_interest + principal + balance);
            }

            scanner.close();
    }


}
