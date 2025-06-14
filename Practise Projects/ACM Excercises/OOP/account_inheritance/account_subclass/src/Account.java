import java.time.LocalDate;
import java.util.Scanner;

public class Account {
    
    Scanner scanner = new Scanner(System.in);

    private int ID;
    private double balance;
    private double annualInterestRate;
    private LocalDate dateCreated;

    //Default constructor
    Account(){
        this.ID = 0;
        this.balance = 0.0;
        this.annualInterestRate = 0.0;
        this.dateCreated = LocalDate.now();
    }
    //A constructor that creates an account with the specified id and initial balance.
    Account(int ID,double balance,double annualInterestRate){
        this.ID = ID;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = LocalDate.now();
    }
    Account(int ID,double balance){ //alternative constructor for atm exercise
        this.ID = ID;
        this.balance = balance;
    }

    //getters for id,balance,annual interest rate
    public int getID(){
        return ID;
    }
    public double getBalance(){
        return balance;
    }
    public double get_annual_interest_rate(){
        return annualInterestRate;
    }
    public LocalDate getDateCreated(){
        return dateCreated;
    }
    //setters for id,balance,interest rate
    public void setID(int ID){
        this.ID = ID;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void set_annual_interest_rate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    //other methods
    public double getMonthlyInterestRate(){
        return (annualInterestRate / 12);
    }
    public double getMonthlyInterest(){
        return balance * (annualInterestRate / 12);
    }
    //withdrawing
    public void withdrawing(){
        
        double amount;
        System.out.println("Enter amount that you want to withdraw");
        amount = scanner.nextDouble();

        if(amount <= balance && amount > 0){
            balance -= amount;
        }
        else{
            System.out.println("You cannot withdraw further money");
        }
    }
    //depositing
    public void depositing(){
        double amount;
        System.out.println("Enter amount you want to deposit!");
        amount = scanner.nextDouble();
            if (amount > 0) {
                balance += amount;
            }
            else{
                System.out.println("Enter an appropriate amount!");
            }
    }
}