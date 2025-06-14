import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        String symbol,stock_name;

        System.out.println("Enter symbol and name of the stock!");
        symbol = scanner.next();
        stock_name = scanner.next();

        Stock object = new Stock(symbol, stock_name);
        object.setPrices();

        double methodResult = object.getChangePercent();
        System.out.printf("Result is : %.2f",methodResult);
    }
}
