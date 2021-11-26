package main.School;

import main.School.Students;
import main.School.Teachers;

public class Test {
    public static void main(String[] args) {
        Teachers t1 = new Teachers();
        Teachers t2 = new Teachers("Veronica", "McCarthy", 30, "I2b");
        Students s1 = new Students();
        Students s2 = new Students("Anne", "Tower", 15, "I2b");
        Students s3 = new Students();
    }
}
