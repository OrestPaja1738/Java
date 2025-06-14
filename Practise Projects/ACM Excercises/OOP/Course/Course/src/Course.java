public class Course {
    private String name; 
    private int number_of_students;
    private int default_capacity;
    private Student student[];

    Course(String name){
        this.name = name;
        this.default_capacity = 2;
        this.student = new Student[default_capacity];
    }
    Course(String name,int capacity){
        this.name = name;
        this.default_capacity = capacity;
        this.student = new Student[default_capacity];
    }
    public int getNumberOfStudents(){
        return default_capacity;
    }
    public String getName(){
        return name;
    }
}
