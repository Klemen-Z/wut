package main.School;

import java.util.HashMap;
import java.util.Random;

public class Test {

    HashMap<Integer, Teacher> Teachers = new HashMap<>();
    HashMap<Integer, Student> Students = new HashMap<>();

    Test(){
        fillS(); fillT();
    }

    public void fillT(){
        Random r = new Random();
        int b = r.nextInt(10);
        while(b == 0){
            b = r.nextInt(10);
        }
        for (int i = 0; i < b; i++){
            Teachers.put(i, new Teacher());
        }
    }
    public void fillS(){
        Random r = new Random();
        int b = r.nextInt(10);
        while(b == 0){
            b = r.nextInt(10);
        }
        for (int i = 0; i < b; i++){
            Students.put(i, new Student());
        }
    }

    public void getHashSize(boolean Teacher, boolean Student){
        if (Teacher && Student){
            System.out.println("\nAmount of teachers: " + Teachers.size());
            System.out.println("Amount of students: " + Students.size());
        }else if(Teacher){
            System.out.println("\nAmount of teachers: " + Teachers.size());
        }else if(Student){
            System.out.println("\nAmount of students: " + Students.size());
        }else{
            System.out.println("\nPlease pick one to count");
        }
    }

    public void allTeacher(){
        for(Teacher Teacher : Teachers.values()){
            System.out.println("\nTeacher: ");
            System.out.println(Teacher.getFirstName());
            System.out.println(Teacher.getLastName());
        }
    }
    public void allStudent(){
        for(Student Student : Students.values()){
            System.out.println("\nStudent: ");
            System.out.println(Student.getFirstName());
            System.out.println(Student.getLastName());
        }
    }

    public Teacher Teacher(Integer HashmapKey){
        Teacher t = null;
        try{
            t = Teachers.get(HashmapKey);
        }
        catch(Error e){
            System.out.println("Teacher doesnt exist");
        }
        return t;
    }
    public Student Student(Integer HashmapKey){
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
        Test test1 = new Test();

        Teacher T = test1.Teacher(0);
        Student S = test1.Student(0);
        System.out.println("\n\nHeadteacher: " + T.getFirstName() + " " + T.getLastName());
        test1.allTeacher();
        test1.getHashSize(true, false);
        System.out.println("\n\nBest Student: " + S.getFirstName() + " " + S.getLastName());
        test1.allStudent();
        test1.getHashSize(false, true);
    }
}
