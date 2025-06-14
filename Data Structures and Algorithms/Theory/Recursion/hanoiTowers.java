import java.util.Scanner;

public class hanoiTowers {
    public static void main(String[] args) {
        char origin = 'A',destination = 'B',temporary = 'C';
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        fn(n,origin,destination,temporary);
    }

    public static void fn(int n,char origin,char destination,char temporary){
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        if (n == 1) {
            System.out.println("Move disk" + n + " from " + origin + " to " + destination);
        }
        else{
            fn(n - 1, origin, temporary, destination); //from origin to temporary,destination not useful for now
            System.out.println("Move disk" + n + " from " + origin + " to " + destination);
            fn(n - 1, temporary, destination, origin);//from from temporary to destination,origin not useful
        }
    }
}
