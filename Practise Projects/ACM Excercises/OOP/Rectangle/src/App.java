import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
    
        Scanner scanner = new Scanner(System.in);

        double width,height;
        System.out.println("Enter width and height of rectangle");
        width = scanner.nextDouble();
        height = scanner.nextDouble();
        
        Rectangle object = new Rectangle(width,height);

        int menu;

            while (true) { 
                System.out.println("Enter option value");
                menu = scanner.nextInt();

                switch (menu) {
                    case 1: //getArea
                        System.out.println("Area is: " + object.getArea());
                        break;
                    case 2: //getPerimeter
                        System.out.println("Area is: " + object.getPerimeter());
                        break;
                    case 3: //get Width
                        System.out.println("Current Width is: " + object.getWidth());
                        break;
                    case 4: //get Height
                        System.out.println("Current Height is: " + object.getHeight());
                        break;
                    case 5://set Width
                        double new_width;
                        System.out.println("Enter new width value");
                        new_width = scanner.nextDouble();
                        object.setWidth(new_width);
                        break;
                    case 6://set height
                        double new_height;
                        System.out.println("Enter new height value");
                        new_height = scanner.nextDouble();
                        object.setHeight(new_height);
                    break;
                    case 0:
                        break;
                    default:
                        throw new AssertionError();
                }
            }

    }

}
