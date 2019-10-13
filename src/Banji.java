import java.util.ArrayList;
public class Banji {
    private int classnum;
    private String headteacher;
    private ArrayList al=null;
    private ArrayList a2=null;
    Banji(){
        al = new ArrayList();
        a2 = new ArrayList();
    }
    public void bjaddStu(Student stu){
        al.add(stu);
        System.out.println("班级添加学生成功");
    }
    public void bjdeleteStu(int num){
        boolean flag=false;
        for(int i=0;i<al.size();i++){
            Student stu=(Student)al.get(i);
            if(stu.getStunum()==num){
                flag=true;
                al.remove(i);
                System.out.println("班级学生删除成功");
                return;
            }
        }
        if(flag==false){
            System.out.println("没有这个学号的学生");
        }
    }
    public void bjaddCou(Course cou){
        a2.add(cou);
        System.out.println("班级添加课程成功");
    }
    public void bjdeleteCou(String c){
        boolean flag=false;
        for(int i=0;i<a2.size();i++){
            Course cou = (Course )a2.get(i);
            if(cou.getCoursename()==c){
                flag=true;
                a2.remove(i);
                System.out.println("班级课程删除成功");
                return;
            }
        }
        if(flag==false){
            System.out.println("没有这个名字的课程");
        }
    }
    public void setClassnum(int c){
        classnum = c;
    }
    public void setHeadteacher(Teacher t){
        headteacher = t.getName();
    }
    public int getClassnum(){return classnum;}
    public String getHeadteacher(){return headteacher;}
    public void print(){
        System.out.println(classnum+" "+headteacher);
        System.out.println("班级学生列表为:");
        for(int i=0;i<al.size();i++) {
            Student stu = (Student) al.get(i);
            stu.print();
        }
        System.out.println("班级课程列表为:");
        for(int i=0;i<al.size();i++) {
            Course cou = (Course) a2.get(i);
            cou.print();
        }
    }
}
