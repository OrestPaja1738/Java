import java.util.ArrayList;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer>vector = new ArrayList<Integer>();

        int n = 0;
        int x;

        while (n < 10) { 
            System.out.println("Enter value !");
            x = scanner.nextInt();
            vector.add(x);

            n++;
        }

        removeDuplicate(vector);
    }

    public static void removeDuplicate(ArrayList<Integer>vector){
        ArrayList<Integer>newVector = new ArrayList<Integer>();

        for(int i = 0;i < vector.size();i++){
            if (!newVector.contains(vector.get(i))) {
                newVector.add(vector.get(i));
            }
        }

        for(int i = 0;i < newVector.size();i++){
            System.out.println(newVector.get(i));
        }
    }
}

