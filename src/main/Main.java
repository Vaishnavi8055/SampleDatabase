package main;

import Data.Courses;
import DatabaseHelper.CourseEntry;
import connection.DatabaseConnection;

import java.sql.SQLException;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) throws SQLException {
            DatabaseConnection databaseConnection = new DatabaseConnection();
            databaseConnection.attemptConnection();
            Scanner sc = new Scanner(System.in);
            System.out.println("enter course name");
            String courseName = sc.nextLine();
            System.out.println("enter course id");
            int courseID = Integer.parseInt(sc.nextLine());
            System.out.println("enter course code");
            String courseCode = sc.nextLine();
            System.out.println("enter course duration");
            int courseDuration = Integer.parseInt(sc.nextLine());
            System.out.println("enter course cost");
            double courseCost = sc.nextDouble();
            Courses courses = new Courses(courseName, courseID, courseCode, courseDuration, courseCost);
            CourseEntry courseEntry = new CourseEntry();
            if (courseEntry.addNewCourseInDatatabse(databaseConnection.getConnection(), courses)) {
                System.out.println("successfull");
            } else {
                System.out.println("failed");
            }
        }
    }



