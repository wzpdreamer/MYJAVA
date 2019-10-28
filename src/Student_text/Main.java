package Student_text;

public class Main {
    public static void main(String[] args){
        StudentList sl = new StudentList();
        Undergraduate u1 = new Undergraduate("张三",30);
        Undergraduate u2 = new Undergraduate("赵六",25);
        Postgraduate p1 = new Postgraduate("王五",16);
        Postgraduate p2 = new Postgraduate("朱重八",15);
        sl.addStudent(u1);
        sl.addStudent(u2);
        sl.addStudent(p1);
        sl.addStudent(p2);
        sl.Refresh();
    }
}
