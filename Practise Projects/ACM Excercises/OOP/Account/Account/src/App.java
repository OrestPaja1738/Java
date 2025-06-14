import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 
        
        Account object = new Account(1122, 20000, 4.5);

        int n;

            while (true) { 
                System.out.println("Enter option");
                n = scanner.nextInt();
                switch (n) {
                    case 1:
                        object.withdrawing();
                        break;
                    case 2:
                        object.depositing();
                        break;
                    case 3:
                        System.out.println("Current balance :" + object.getBalance());
                        break;
                    case 4:
                        System.out.println("Monthly interest :" + object.getMonthlyInterest());
                        break;
                    case 5:
                        System.out.println("Creation information :" + object.getDateCreated());
                        break;
                    default:
                        throw new AssertionError();
                }
            }

    }
}
