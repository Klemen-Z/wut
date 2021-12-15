package main.School;

import java.util.HashMap;

public class Test {

    static HashMap<Integer, Teacher> Teachers = new HashMap<>();
    static HashMap<Integer, Student> Students = new HashMap<>();

    public static void fillT(){
        int b = 5;
        Teachers.put(0, new Teacher());
        Teachers.put(1, new Teacher("Veronica", "McCarthy", 30, "I2b"));
        for (int i = 2; i < b; i++){
            Teachers.put(i, new Teacher());
        }
    }
    public static void fillS(){
        int b = 5;
        Students.put(0, new Student());
        Students.put(1, new Student("Anne", "Tower", 15, "I2b"));
        for (int i = 2; i < b; i++){
            Students.put(i, new Student());
        }
    }

    public static void getHashSize(boolean Teacher, boolean Student){
        if (Teacher && Student){
            System.out.println("\nTeacher Count: " + Teachers.size());
            System.out.println("Student Count: " + Students.size());
        }else if(Teacher){
            System.out.println("\nTeacher Count: " + Teachers.size());
        }else if(Student){
            System.out.println("\nStudent Count: " + Students.size());
        }else{
            System.out.println("\nPlease pick one to count");
        }
    }

    public static void allTeacher(){
        for(Teacher Teacher : Teachers.values()){
            System.out.println("Teacher: ");
            System.out.println(Teacher.getFirstName());
            System.out.println(Teacher.getLastName());
        }
    }
    public static void allStudent(){
        for(Student Student : Students.values()){
            System.out.println("Student: ");
            System.out.println(Student.getFirstName());
            System.out.println(Student.getLastName());
        }
    }

    public static Teacher Teacher(Integer HashmapKey){
        Teacher t = null;
        try{
            t = Teachers.get(HashmapKey);
        }
        catch(Error e){
            System.out.println("Teacher doesnt exist");
        }
        return t;
    }
    public static Student Student(Integer HashmapKey){
        Student s = null;
        try{
            s = Students.get(HashmapKey);
        }
        catch(Error e){
            System.out.println("Student doesnt exist");
        }
        return s;
    }

    public static void main(String[] args) {

        fillT();
        fillS();

        Teacher t = Teacher(1);
        Student s = Student(1);

        if (t != null) System.out.println("Teacher: \n" + t.getFirstName() + "\n ");
        if (t != null) System.out.println("Student: \n" + s.getFirstName() + "\n ");

        allTeacher();
        allStudent();

        getHashSize(true, true);
    }
}
