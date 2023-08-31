package clasess;

import clasess.Course;
import interfacess.StudentInterface;

public class Students implements StudentInterface {
    private String name;
    private String phoneNumber;
    private String address;
    private Course course;
    private Classes classes;
    private Boolean goodReport;


    public Students(String name, String phoneNumber, String address, Course course, Classes classes,Boolean goodReport) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.course = course;
        this.classes = classes;
        this.goodReport=goodReport;
    }

    public Students() {
    }

    public Students(String name, String phoneNumber, String address, Classes classes, Boolean goodReport) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.classes = classes;
        this.goodReport = goodReport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public Boolean getGoodReport() {
        return goodReport;
    }

    public void setGoodReport(Boolean goodReport) {
        this.goodReport = goodReport;
    }

    @Override
    public String toString() {
        return "clasess.Students{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", course=" + course +
                ", classes=" + classes +
                '}';
    }

    @Override
    public String takeCourse(Course course) {
        Students students=new Students();
        students.setName("Anayochukwu James");
        String result= students.getName()+" Offers "+course;
        return result;
    }
}
