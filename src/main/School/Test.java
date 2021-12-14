package main.School;

import java.util.HashMap;

public class Test {

    static HashMap<Integer, Teacher> Teachers = new HashMap<>();
    static HashMap<Integer, Student> Students = new HashMap<>();

    public static void fillT(){
        Teachers.put(1, new Teacher());
        Teachers.put(2, new Teacher("Veronica", "McCarthy", 30, "I2b"));
    }
    public static void fillS(){
        Students.put(1, new Student());
        Students.put(2, new Student("Anne", "Tower", 15, "I2b"));
        Students.put(3, new Student());
    }

    public static Teacher Teacher(int HashmapKey){
        Teacher t = null;
        try{
            t = Teachers.get(HashmapKey);
        }
        catch(Error e){
            System.out.println("Teacher doesnt exist");
        }
        return t;
    }
    public static Student Student(int HashmapKey){
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

    }
}
