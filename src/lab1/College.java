/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.*;

/**
 *
 * @author pdavis13
 */
public class College {
    private List<Course> inventory = new ArrayList<Course>();
    
    public void AddCourseToInventory(Course course){
        inventory.add(course);
        System.out.println("Course " + course.getCourseName() + " added to inventory");
    }
}
