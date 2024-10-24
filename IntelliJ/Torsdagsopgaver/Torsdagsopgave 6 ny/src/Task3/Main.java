package Task3;

import java.util.ArrayList;
import java.util.List;
// Stort set alt er taget fra chatGPT - i forsøg på at forstå opgaven - jeg kan stadig ikke forstå den
// Stort set alt er taget fra chatGPT - i forsøg på at forstå opgaven - jeg kan stadig ikke forstå den
// Stort set alt er taget fra chatGPT - i forsøg på at forstå opgaven - jeg kan stadig ikke forstå den
// Stort set alt er taget fra chatGPT - i forsøg på at forstå opgaven - jeg kan stadig ikke forstå den

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();


        Person student1 = new Student("Benjamin", new ArrayList<>(), new ArrayList<>());
        student1.addPassedCourse("Biology");
        student1.addCourse("Chemistry");
        persons.add(student1);

        Person student2 = new Student("Bob", new ArrayList<>(), new ArrayList<>());
        student2.addPassedCourse("Java 1.0");
        student2.addCourse("Chemistry");
        persons.add(student2);

        Person student3 = new Student("Charlie", new ArrayList<>(), new ArrayList<>());
        student3.addPassedCourse("Math");
        student3.addCourse("English");
        persons.add(student3);


        Person teacher1 = new Teacher("Mr. Smith", new ArrayList<>(List.of("Biology", "Chemistry", "Java 1.0")), new ArrayList<>());
        teacher1.addCourse("Biology");
        persons.add(teacher1);

        Person teacher2 = new Teacher("Ms. Johnson", new ArrayList<>(List.of("Math", "English")), new ArrayList<>());
        teacher2.addCourse("English");
        persons.add(teacher2);


        for (Person person : persons) {
            boolean added = person.addCourse("Java 1.0");
            if (added) {
                if (person instanceof Student) {
                    System.out.println(person.getName() + " har bestået dette kursus.");
                } else if (person instanceof Teacher) {
                    System.out.println(person.getName() + " kan undervise i dette fag.");
                }
            }
        }
    }

}