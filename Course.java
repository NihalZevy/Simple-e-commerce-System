public class Course {
    private String courseCode;
    private String name;
    private int maxCapacity;
    private int currentEnrollment = 0;

    private static int totalEnrolledStudents = 0;   // static across ALL courses

    public Course(String courseCode, String name, int maxCapacity) {
        this.courseCode = courseCode;
        this.name = name;
        this.maxCapacity = maxCapacity;
    }

    // Getters as required + Setters for Course Update (20 points)
    public String getCourseCode() { return courseCode; }
    public String getName() { return name; }
    public int getMaxCapacity() { return maxCapacity; }
    public int getCurrentEnrollment() { return currentEnrollment; }

    public void setCourseCode(String courseCode) { this.courseCode = courseCode; }
    public void setName(String name) { this.name = name; }
    public void setMaxCapacity(int maxCapacity) { this.maxCapacity = maxCapacity; }

    public boolean isFull() {
        return currentEnrollment >= maxCapacity;
    }

    public void incrementEnrollment() {
        if (!isFull()) {
            currentEnrollment++;
            totalEnrolledStudents++;
        }
    }

    public static int getTotalEnrolledStudents() {
        return totalEnrolledStudents;
    }

    @Override
    public String toString() {
        return courseCode + " - " + name + " (" + currentEnrollment + "/" + maxCapacity + ")";
    }
}