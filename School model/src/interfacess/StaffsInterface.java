package interfacess;

import clasess.Applicants;
import clasess.Course;
import clasess.Staffs;
import clasess.Students;

public interface StaffsInterface {
    String expelStudent(Staffs staffs,Students students);
    String teachCourse(Course course);
    String admitted(Applicants applicants,Staffs staffs);
}
