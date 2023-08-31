package clasess;

import interfacess.StaffsInterface;

public class Staffs implements StaffsInterface {
    private String name;
    private String title;
    private String address;
    private String phoneNumber;
    private Course course;

    public Staffs(String name, String title, String address, String phoneNumber, Course course) {
        this.name = name;
        this.title = title;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.course = course;
    }

    public Staffs() {
    }

    public Staffs(String name, String title, String address, String phoneNumber) {
        this.name = name;
        this.title = title;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "clasess.Staffs{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", course=" + course +
                '}';
    }


    @Override
    public String expelStudent(Staffs staffs,Students students) {
        if (staffs.getTitle().equalsIgnoreCase("Principal")){
            if (!students.getGoodReport()){
                return students.getName()+ " Is Expelled";
            }
            return "Good Student";
        }
        return "Only a Principal can expel student";
    }

    @Override
    public String teachCourse(Course course) {
        return course.getTitle()+"is handled by"+ course.getTeacher().getName();
    }

    @Override
    public String admitted(Applicants applicants,Staffs staffs) {
        if (staffs.getTitle().equalsIgnoreCase("Principal")) {
            if (applicants.getScore() >= 70) {
                return applicants.getName() + " is admitted";
            }
            return applicants.getName() + "try again later";
        }
        return "Only a Principal can admit student";
    }
}
