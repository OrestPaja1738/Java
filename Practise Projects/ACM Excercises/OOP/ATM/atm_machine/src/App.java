import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
    Scanner scanner = new Scanner(System.in);

    Account account_Array[] = new Account[10];

        for(int i = 0; i < 10; i++){
            account_Array[i] = new Account(i, 100.0);
        }

        int user_id;
        int menu_option;

        while (true) { 
            System.out.println("Enter your user id!");
            user_id = scanner.nextInt();

            if (user_id >= 0 && user_id <=9) {
                
                while (true) { 
                System.out.println("Enter menu option!");
                menu_option = scanner.nextInt();

                switch (menu_option) {
                    case 1: //view balance
                    System.out.println("Balance " + account_Array[user_id].getBalance());
                        break;
                    case 2://withdraw balance
                    account_Array[user_id].withdrawing();
                        break;
                    case 3://depositing money
                    account_Array[user_id].depositing();
                        break;
                    case 4:
                        System.out.println("Exiting out of menu options");
                        break;
                    default:
                        throw new AssertionError();
                }
                    if(menu_option == 4){
                        break;
                    }
                }
            }

            else if(user_id == -1){
                System.err.println("Closing menu...");
                break;
            }
            else{
                System.out.println("Your id is not in the database.Try again");
            }
        }
    }
}
