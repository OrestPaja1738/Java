
import java.util.Scanner;


public class summator {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int a;
    int b;

    System.out.println("Enter values for a and b!");
    a = scanner.nextInt();
    b = scanner.nextInt();

    int fnResult = getResult(a,b);

        System.out.println("Result is:" + fnResult);
    }

    public static int getResult(int a,int b){
        int sum;
        if(a != b){
            sum = a + b;
        }
        else{
            sum = a + b;
            sum *= 2;
        }

        return  sum;
    }
}
