import java.util.Scanner;

public class student_grade_Avgs {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.println("Enter number of students");
        n = scanner.nextInt();

        String[] studentNames = new String[n];
        
        int[][] gradeMatrix = new int[n][5];
        float[] studentAverages = new float[n];

            getStudentNames(studentNames,n,scanner);

            for(int i = 0;i < n;i++){

                int sum = 0;

                for(int j = 0; j < 5;j++){
                    System.out.println("Enter value");
                    gradeMatrix[i][j] = scanner.nextInt();

                    sum += gradeMatrix[i][j];
                }

                studentAverages[i] = sum / (float)5;
            }

            //UNFINISHED JUST PRINTING LEFT P MUCH

            scanner.close();
    }

    public static void getStudentNames(String[] studentNames,int n,Scanner scanner){
            
        for(int i = 0;i < n;i++){
            System.out.println("Enter student's name");
            studentNames[i] = scanner.next();
        }
    }

}
