package Task3;

import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<String> passedCourses;
    private ArrayList<String> currentCourses;

    public Student(String name, ArrayList<String> passedCourses, ArrayList<String> currentCourses) {
        super(name);
        this.passedCourses = new ArrayList<>();
        this.currentCourses = new ArrayList<>();
    }

    @Override
    public boolean addCourse(String course){
        if(passedCourses.contains(course)){
            return false;
        }
        else {
            currentCourses.add(course);
            return true;
        }
    }
    public ArrayList<String> getCurrentCourses() {
        return currentCourses;
    }
    public ArrayList<String> getPassedCourses() {
        return passedCourses;
    }
}
