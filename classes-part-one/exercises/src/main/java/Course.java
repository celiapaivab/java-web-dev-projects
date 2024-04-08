import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher teacherName;
    private ArrayList<Student> enrolledStudents;

    public String getTopic() {
        return topic;
    }

    public Teacher getTeacherName() {
        return teacherName;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
