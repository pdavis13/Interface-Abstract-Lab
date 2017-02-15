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

    public void setPrerequisites(List<Course> prerequisites) {
        if(prerequisites == null) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        if(credits < 0 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
}
