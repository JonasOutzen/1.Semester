import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Student {
    String name;
    int grade;

    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String toString() {
        return "Name: " + name + " Grade: " + grade;
    }


}

