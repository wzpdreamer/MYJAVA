package Student_text;
import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public List<Student> students;
    public StudentList(){
        students = new ArrayList<Student>();
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void Refresh(){
        for(Student student : students){
            student.JudgeScore();
        }
    }
}
