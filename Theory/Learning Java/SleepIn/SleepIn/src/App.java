import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception { //aka big main fn

        Scanner scanner = new Scanner(System.in);

        boolean weekday;
        boolean vacation;

        System.out.println("Enter truth values for bool 1");
        weekday = scanner.nextBoolean();
        System.out.println("Enter truth values for bool 2");
        vacation = scanner.nextBoolean();

        boolean status = sleepStatus(weekday,vacation);
        System.out.println("Result is:" + status);

        scanner.close();
    }

    public static boolean sleepStatus(boolean weekday,boolean  vacation){ //another fn
        boolean value;
            if(!weekday || vacation == true ){
                value = true;
            }
            else{
                value = false;
            }

            return  value;
    } 

}
