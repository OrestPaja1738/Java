import  java.util.Scanner;

public class costShipping{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double w;
        System.out.println("Enter value for weight");
        w = scanner.nextInt();

        getCost(w,scanner);
    }

    public static void getCost(double w,Scanner scanner){
        
        if(w > 0 && w <= 2){
            System.out.println("2.5");
        }
        else if (w > 2 && w <= 4) {
            System.out.println("4.5");
        }
        else if(w > 4 && w <= 10){
            System.out.println("7.5");
        }
        else if(w > 10 && w <= 20){
            System.out.println("10.5");
        }
        else{
            System.out.println("Package cannot be shipped!");
        }
    }
}