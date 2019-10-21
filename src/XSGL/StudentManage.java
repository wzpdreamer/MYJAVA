package XSGL;

import java.util.ArrayList;
public class StudentManage {
    private int bkstunum=0;
    private int yjsstunum=0;
    private ArrayList al=null;
    StudentManage(){
        al = new ArrayList();
    }
    //添加一个学生
    public void addStu(Student stu){
        al.add(stu);
        System.out.println("添加学生成功");
    }
    //设置学号
    public void Applystunum(Student stu){
        if(stu.getIsgrastu()){
            yjsstunum++;
            stu.setStunum(yjsstunum);
        }
        else{
            bkstunum++;
            stu.setStunum(bkstunum);
        }
    }
    public void isyjsstu(Student stu, String t){
        stu.setIsgraduatestu();
        stu.setTitleofpaper(t);
    }
    public void isgraduated(String i, Student stu){
        if(i == "yes"){
            stu.setGrade(stu.getGrade() * 10 + 1);
        }
        else if(i == "no"){
            stu.setGrade(stu.getGrade() * 10 + 2);
        }
        else{
            System.out.println("Error input!");
        }
    }
    //查找一个学生
    public void selectStu(int num){
        boolean flag=false;
        for(int i=0;i<al.size();i++){
            Student stu=(Student)al.get(i);
            if(stu.getStunum()==num){
                flag=true;
                System.out.println(stu);
                return;
            }
        }
        if(flag==false){
            System.out.println("没有这个学号的学生");
        }
    }
    //12:根据学号更新学生基本信息
    public void updateStu(int number,int n,String name, int g, int b){
        boolean flag=false;
        for(int i=0;i<al.size();i++){
            Student stu=(Student)al.get(i);
            if(stu.getStunum()==number){
                flag=true;
                stu.setStunum(n);
                stu.setName(name);
                stu.setGrade(g);
                stu.setStubjnum(b);
                System.out.println("学生信息更新成功");
                return;
            }
        }
        if(flag==false){
            System.out.println("没有这个学号的学生");
        }
    }
    //根据学号删除学生
    public void deleteStu(int num){
        boolean flag=false;
        for(int i=0;i<al.size();i++){
            Student stu=(Student)al.get(i);
            if(stu.getStunum()==num){
                flag=true;
                al.remove(i);
                System.out.println("学生删除成功");
                return;
            }
        }
        if(flag==false){
            System.out.println("没有这个学号的学生");
        }
    }
    public void print(){
        System.out.println("全体学生列表为:");
        for(int i=0;i<al.size();i++) {
            Student stu = (Student) al.get(i);
            stu.print();
        }
    }
}
