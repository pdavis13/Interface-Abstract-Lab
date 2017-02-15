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
public class Startup {
    public static void main(String[] args) {
        AdvancedJavaCourse advancedJavaCourse = new AdvancedJavaCourse("Advanced Java");
        IntroToProgrammingCourse introToProgrammingCourse = new IntroToProgrammingCourse("Intro to Programming");
        IntroJavaCourse introJavaCourse = new IntroJavaCourse("Intro to Java");
        
        List<Course> prereqs = new ArrayList<Course>();
        
        introToProgrammingCourse.setCourseNumber("200162");
        introToProgrammingCourse.setCredits(3);
        introToProgrammingCourse.setPrerequisites(prereqs);
        
        introJavaCourse.setCourseNumber("200122");
        introJavaCourse.setCredits(3);
        introJavaCourse.setPrerequisites(prereqs);
        
        prereqs.add(introJavaCourse);
        
        advancedJavaCourse.setCourseNumber("200262");
        advancedJavaCourse.setCredits(3);
        advancedJavaCourse.setPrerequisites(prereqs);
        
        College college = new College();
        college.AddCourseToInventory(introJavaCourse);
        college.AddCourseToInventory(introToProgrammingCourse);
        college.AddCourseToInventory(advancedJavaCourse);
    }
}
