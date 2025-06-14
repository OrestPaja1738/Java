import java.util.Scanner;

public class Stock {

    Scanner scanner = new Scanner(System.in);

    private String symbol;
    private String stock_name;
    private double previousClosingPrice = 0;
    private double currentPrice;
    
    Stock(String symbol,String stock_name){
        this.symbol = symbol;
        this.stock_name = stock_name;
    }

    public void setPrices(){
        double currP,prevP;

        System.out.println("Enter current previous price and current price");
        prevP = scanner.nextDouble();
        currP = scanner.nextDouble();

        this.previousClosingPrice = prevP;
        this.currentPrice = currP;
    }
    
    public double getChangePercent(){
        
        double methodOutput = ((this.currentPrice - this.previousClosingPrice) / previousClosingPrice) * 100;

        return methodOutput;
    }

}
