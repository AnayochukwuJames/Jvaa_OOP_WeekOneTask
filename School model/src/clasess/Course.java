package clasess;

import java.util.List;

public class Course {
    private String title;
    private String courseCode;
    private Staffs teacher;

    public Course(String title, String courseCode, Staffs teacher) {
        this.title = title;
        this.courseCode = courseCode;
        this.teacher = teacher;
    }

    public Course() {
    }

    public Course(String title, String courseCode) {
        this.title = title;
        this.courseCode = courseCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Staffs getTeacher() {
        return teacher;
    }

    public void setTeacher(Staffs teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", courseCode='" + courseCode + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
