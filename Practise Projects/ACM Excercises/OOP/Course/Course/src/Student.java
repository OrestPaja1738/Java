public class Student {
    private int ID;
    private String name;
    private String surname;

    Student(int ID,String name,String surname){
        this.ID = ID;
        this.name = name;
        this.surname = surname;
    }
    
    public int getID(){
        return ID;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }

    public void printInformation(){
        System.out.println("Student : " + name + surname + ID);
    }
}
