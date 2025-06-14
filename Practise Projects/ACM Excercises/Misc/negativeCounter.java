
import java.util.Scanner;


public class negativeCounter {

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        int n;
        int cntP = 0,cntN = 0,total = 0,denom = 0;

        while (true) { 
            System.out.println("Enter value for n!");
            n = scanner.nextInt();

            total += n;

            if(n > 0){
                cntP++;
                denom++;
            }
            else if(n < 0){
                cntN++;
                denom++;
            }
            else{
                break;
            }
        }
        
        System.out.println("The number of positives is " + cntP);
        System.out.println("The number of negatives is " + cntN);
        System.out.println("The total is " + total);
        System.out.println("The average is " + total / (float)denom);
        
    }
}
