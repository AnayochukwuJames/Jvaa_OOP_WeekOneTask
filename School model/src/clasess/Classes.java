package clasess;

import clasess.Course;

import java.util.Arrays;

public class Classes {
    private String level;
    private Course[] subjects;

    public Classes(String level, Course[] subjects) {
        this.level = level;
        this.subjects = subjects;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Course[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Course[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "clasess.Classes{" +
                "level='" + level + '\'' +
                ", subjects=" + Arrays.toString(subjects) +
                '}';
    }
}
