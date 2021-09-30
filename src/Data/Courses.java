package Data;

public class Courses {
    private String courseName;
    private int courseID;
    private String courseCode;
    private int courseDuration;
    private double courseCost;

    public Courses(String courseName, int courseID, String courseCode, int courseDuration, double courseCost) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.courseCode = courseCode;
        this.courseDuration = courseDuration;
        this.courseCost = courseCost;
    }
/*

    public String toString(){
        return String.format("%-20s:%-4d:%2s:%d:%-10f",this.courseName,this.courseID,this.courseCode,this.courseDuration,this.courseCost);
    }
*/

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    public double getCourseCost() {
        return courseCost;
    }

    public void setCourseCost(double courseCost) {
        this.courseCost = courseCost;
    }
}
