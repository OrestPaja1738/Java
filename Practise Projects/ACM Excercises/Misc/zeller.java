
import java.util.Scanner;

public class zeller {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year;
        System.out.println("Enter year:");
        year = scanner.nextInt();
        int month;
        System.out.println("Enter month:");
        month = scanner.nextInt();

            if (month == 1 || month == 2) {
                month += 12;
                year--;
            }
        int q; //day of the month
        System.out.println("Enter day of the month:");
        q = scanner.nextInt();

        int h = getValue(q,month,(year % 100),(year / 100));

        printOutput(h);

        scanner.close();
    }

    public static int getValue(int q,int month,int k,int j){

        int y;
        y = (26 * (month + 1)) / 10;

        int fnOutput = (q + y + k + (k / 4) + (j / 4) + 5 * j) % 7;

       return  fnOutput;
    }

    public static void printOutput(int h){
        switch (h) {
            case 0 -> System.out.println("Saturday");
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            default -> throw new AssertionError();
        }
    }
}
