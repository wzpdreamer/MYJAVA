package XSGL;

import java.util.ArrayList;

public class TeacherManage {
    private ArrayList al=null;
    TeacherManage(){
        al = new ArrayList();
    }
    //添加一个老师
    public void addTea(Teacher tea){
        al.add(tea);
        System.out.println("添加老师成功");
    }
    //查找一个学生
    public void selectTea(String n){
        boolean flag=false;
        for(int i=0;i<al.size();i++){
            Teacher tea =(Teacher)al.get(i);
            if(tea.getName()==n){
                flag=true;
                System.out.println(tea);
                return;
            }
        }
        if(flag==false){
            System.out.println("没有这个姓名的老师");
        }
    }
    //根据姓名更新老师基本信息
    public void updateTea(String name, String c){
        boolean flag=false;
        for(int i=0;i<al.size();i++){
            Teacher tea= (Teacher)al.get(i);
            if(tea.getTeacourse()==c){
                flag=true;
                tea.setTeacourse(c);
                System.out.println("老师信息更新成功");
                return;
            }
        }
        if(flag==false){
            System.out.println("没有这个姓名的老师");
        }
    }
    //根据姓名删除老师
    public void deleteTea(String n){
        boolean flag=false;
        for(int i=0;i<al.size();i++){
            Teacher tea=(Teacher) al.get(i);
            if(tea.getName()==n){
                flag=true;
                al.remove(i);
                System.out.println("老师删除成功");
                return;
            }
        }
        if(flag==false){
            System.out.println("没有这个姓名的老师");
        }
    }
    public void print(){
        System.out.println("全体老师列表为:");
        for(int i=0;i<al.size();i++) {
            Teacher tea = (Teacher) al.get(i);
            tea.print();
        }
    }
}
