import  java.io.File;
import java.io.IOException;
import  java.io.PrintWriter;
import  java.util.Scanner;

public class ReplaceTxt {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask user to enter the source file
        System.err.println("Enter the source file name");
        String source = input.nextLine();

        //ask user to enter target file

        System.err.println("Enter the target file");
        String target = input.nextLine();

        File sourceFile = new File(source);

        if (!sourceFile.exists()) {
            System.err.println("The file does not exist");
            System.exit(1);
        }

        File targetFile = new File(target);

        if (!targetFile.exists()) {
            System.err.println("The file does not exist");
            System.exit(1);
        }

        //ask the user to enter name to be replaced
        System.out.println("Enter the name to be replaced");
        String oldName = input.next();

        System.out.println("Enter the new name to be replaced");
        String newName = input.next();

        try(Scanner readingSource = new Scanner(sourceFile);
            PrintWriter writingSource = new PrintWriter(targetFile);
        ){
            while(readingSource.hasNext()){
                String s1 = readingSource.nextLine();
                String s2 = s1.replace(oldName,newName);

                writingSource.println(s2);
            }
        }
        catch(IOException ex){
            System.out.println("Error has happened" + ex.getMessage());
        }
    }
}
