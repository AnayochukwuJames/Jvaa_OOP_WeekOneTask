import clasess.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Staffs staffs = new Staffs();
        Students students= new Students();

        Staffs teacher= new Staffs("Mr Kazeem","Teacher","Ajah","9098787");

        Course course= new Course("Geography","Geo211",teacher);
        Course[] ss3Courses={new Course("MATH","Math121"),new Course("English","Eng121")};
        Classes ss3= new Classes("ss3",ss3Courses);
        Staffs principal=new Staffs("Mr Kabe","principal","Ukehe","050");
        Students student=new Students("Agbo Ken","070374656","N07 ojota",ss3,true);
        Applicants applicants= new Applicants("Emma Eze","AWKA",80);


        System.out.println(staffs.expelStudent(principal,student));
        System.out.println(staffs.teachCourse(course));
        System.out.println(staffs.admitted(applicants,principal));
        System.out.println(students.takeCourse(course));

    }
}