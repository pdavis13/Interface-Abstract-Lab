/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author pdavis13
 */
public class Course {
    private String courseName;
    private List<Course> prerequisites;
    private String courseNumber;
    private double credits;
    private String category;

    public Course(String courseName){
        this.courseName = courseName;
    }
    
    public String getCourseName() {
        return courseName;
    }

    public List<Course> getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(List<Course> prerequisites) {
        if(prerequisites == null) {
            throw new IllegalArgumentException("invalid credit amount");
        }
        this.prerequisites = prerequisites;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public final void setCredits(double credits) {
        if(credits < 0 || credits > 4.0) {
            throw new IllegalArgumentException("invalid credit amount");
        }
        this.credits = credits;
    }
}
