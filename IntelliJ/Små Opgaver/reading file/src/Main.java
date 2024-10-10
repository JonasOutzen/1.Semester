import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File studentsAndGrades = new File("Name and grade.txt");

        try {
            Scanner gradeReader = new Scanner(studentsAndGrades);
            while (gradeReader.hasNextLine()) {
                String readingGrade = gradeReader.nextLine();
                String[] result = readingGrade.split(",");
                Student student = new Student(result[0], Integer.parseInt(result[1]));
                System.out.println(student.toString());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}





/*
public class Main {
    public static void main(String[] args) {


       File readingFile = new File("Læs denne fil.txt");

        try {
            Scanner fileReader = new Scanner(readingFile);
            String readingTryout = fileReader.nextLine();
            System.out.println(readingTryout);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}*/