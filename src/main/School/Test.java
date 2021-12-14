package main.School;


import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, Teacher> Teachers = new HashMap<>();
        HashMap<Integer, Student> Students = new HashMap<>();

        Teachers.put(1, new Teacher());
        Teachers.put(2, new Teacher("Veronica", "McCarthy", 30, "I2b"));
        Students.put(1, new Student());
        Students.put(2, new Student("Anne", "Tower", 15, "I2b"));
        Students.put(3, new Student());
        System.out.println("\n \n");
        for(Student s: Students.values())
        {
            System.out.println("Student: \n");
            System.out.println(s.getFirstName());
            System.out.println(s.getLastName());
            System.out.println("\n \n");
        }
        for(Teacher t: Teachers.values())
        {
            System.out.println("Teacher: \n");
            System.out.println(t.getFirstName());
            System.out.println(t.getLastName());
            System.out.println("\n \n");
        }
    }
}
