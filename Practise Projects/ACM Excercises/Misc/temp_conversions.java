
import java.util.Scanner;


public class temp_conversions {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double temperature;
        System.out.println("Enter temperature value");
        temperature = scanner.nextDouble();

        char type;
        System.out.println("Enter current metric Fahrenheit/Celsius ");
        type = scanner.next().charAt(0);
            if (type != 'F' && type != 'C') {
                System.out.println("Reenter value C or F");
                type = scanner.next().charAt(0);
            }


        switch (type) {
            case 'F':
                double fnResult1 = fahrenheit_to_celsius(temperature);
                System.out.println("Converted value: " + fnResult1 + " °C");
                break;
            case 'C':
                double fnResult2 = celsius_to_fahrenheit(temperature);
                System.out.println("Converted value: " + fnResult2 + " °F");
                break;
            default:
                break;
        }

        scanner.close();
    }

    public static double fahrenheit_to_celsius(double fahrenheit){
        
        double celsius = (5.0 / 9) * (fahrenheit - 32);

            return celsius;
    }

    public static double celsius_to_fahrenheit(double celsius){

        double fahrenheit = ((9.0 / 5) * celsius) + 32; 

            return fahrenheit;
    }
}
