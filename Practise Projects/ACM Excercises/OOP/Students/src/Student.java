import java.util.Scanner;

public class Student {
    String name;
    int[] grades = new int[5];
    float average;

    Scanner scanner = new Scanner(System.in);

    Student(){
        this.name = "NULL";
    }

    Student(String name){
        this.name = name;
    }

    public void setGrades(){
        for(int i = 0;i < 5;i++){
            System.out.println("Enter students grade");
            this.grades[i] = scanner.nextInt();
        }
    }

    public void setAverage(){
        
        int sum = 0;

        for(int i = 0; i < 5;i++){
            sum += this.grades[i];
        }

        this.average = sum / (float)5;
    }

}
