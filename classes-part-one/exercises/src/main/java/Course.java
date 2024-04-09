import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher teacherName;
    private ArrayList<Student> enrolledStudents = new ArrayList<>();


    public Course(String topic, Teacher teacherName) {
        this.topic = topic;
        this.teacherName = teacherName;
    }

    public String getTopic() {
        return topic;
    }

    public Teacher getTeacherName() {
        return teacherName;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setTeacherName(Teacher teacherName) {
        this.teacherName = teacherName;
    }
}
