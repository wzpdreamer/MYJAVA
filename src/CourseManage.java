import java.util.ArrayList;

public class CourseManage {
    private ArrayList al=null;
    CourseManage(){
        al = new ArrayList();
    }
    //添加一个课程
    public void addCou(Course cou){
        al.add(cou);
        System.out.println("添加课程成功");
    }
    //查找一个课程
    public void selectou(String c){
        boolean flag=false;
        for(int i=0;i<al.size();i++){
            Course cou = (Course)al.get(i);
            if(cou.getCoursename()==c){
                flag=true;
                System.out.println(cou);
                return;
            }
        }
        if(flag==false){
            System.out.println("没有这个名字的课程");
        }
    }
    //根据名字更新课程基本信息
    public void updateCou(String name, int n,String t){
        boolean flag=false;
        for(int i=0;i<al.size();i++){
            Course cou = (Course)al.get(i);
            if(cou.getCoursename()==name){
                flag=true;
                cou.setInstructor(t);
                cou.setCoubjnum(n);
                System.out.println("课程信息更新成功");
                return;
            }
        }
        if(flag==false){
            System.out.println("没有这个名字的课程");
        }
    }
    //根据名字删除课程
    public void deleteCou(String c){
        boolean flag=false;
        for(int i=0;i<al.size();i++){
            Course cou = (Course )al.get(i);
            if(cou.getCoursename()==c){
                flag=true;
                al.remove(i);
                System.out.println("课程删除成功");
                return;
            }
        }
        if(flag==false){
            System.out.println("没有这个名字的课程");
        }
    }
    public void print(){
        System.out.println("全体课程列表为:");
        for(int i=0;i<al.size();i++) {
            Course cou = (Course) al.get(i);
            cou.print();
        }
    }
}
