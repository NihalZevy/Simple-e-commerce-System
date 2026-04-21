import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String name;
    private String id;
    private List<Course> enrolledCourses;
    private Map<Course, Double> grades;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.enrolledCourses = new ArrayList<>();
        this.grades = new HashMap<>();
    }

    // Getters and Setters - enables Student Update (20 points)
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public List<Course> getEnrolledCourses() {
        return new ArrayList<>(enrolledCourses); // defensive copy
    }

    public Map<Course, Double> getGrades() {
        return new HashMap<>(grades); // defensive copy
    }

    // Instance methods that manipulate object state
    public void enroll(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
        }
    }

    public void assignGrade(Course course, double grade) {
        grades.put(course, grade);
    }

    @Override
    public String toString() {
        return "Student: " + name + " (" + id + ")";
    }
}