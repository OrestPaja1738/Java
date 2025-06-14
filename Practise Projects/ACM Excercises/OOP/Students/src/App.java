import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        int n;
        System.out.println("Enter number of students");
        n = scanner.nextInt();

        Student[] object = new Student[n];

        getData(object,scanner);

        sortObjects(object);

        //printResults -- END
    }

    public static void getData(Student[] object,Scanner scanner){

        for(int i = 0; i < object.length;i++){
            String studentName;
            //int studentGrade;

            System.out.println("Enter students name");
            studentName = scanner.next();
            
            object[i] = new Student(studentName);

            object[i].setGrades();

            object[i].setAverage();
        }
    }

    public static void sortObjects(Student[] object){

        for (int i= 0; i < object.length; i ++) {
            for(int j = 1; j < object.length;j++){
                if (object[i].average > object[j].average) {
                    Student temp = new Student();
                    temp = object[i];
                    object[i] = object[j];
                    object[j] = temp;
                }
            }
        }
    }

}
