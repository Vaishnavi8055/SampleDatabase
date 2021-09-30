package DatabaseHelper;

import Data.Courses;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CourseEntry {

    public boolean addNewCourseInDatatabse(Connection connection, Courses courses) throws SQLException {
        String courseName = courses.getCourseName();
        int courseID = courses.getCourseID();
        String courseCode = courses.getCourseCode();
        int courseDuration = courses.getCourseDuration();
        double courseCost = courses.getCourseCost();

        PreparedStatement p = connection.prepareStatement("INSERT INTO courses(courseID,courseName,courseCode,courseDuration,CourseCost) Values(?,?,?,?,?);");
p.setString(2,courseName);
p.setInt(1,courseID);
p.setString(3,courseCode);
p.setInt(4,courseDuration);
p.setDouble(5,courseCost);
        int n=p.executeUpdate();
        return n>=1;

    }

}
