package XSGL;

import java.util.ArrayList;

public class BanjiManage {
    private ArrayList al=null;
    BanjiManage(){
        al = new ArrayList();
    }
    //添加一个班级
    public void addClass(Banji b){
        al.add(b);
        System.out.println("添加班级成功");
    }
    //查找一个班级
    public void selectClass(int num){
        boolean flag=false;
        for(int i=0;i<al.size();i++){
            Banji b= (Banji) al.get(i);
            if(b.getClassnum()==num){
                flag=true;
                System.out.println(b);
                return;
            }
        }
        if(flag==false){
            System.out.println("没有这个班号的班级");
        }
    }
    //根据班号更新班级基本信息
    public void updateClass(int number,Teacher t){
        boolean flag=false;
        for(int i=0;i<al.size();i++){
            Banji b= (Banji) al.get(i);
            if(b.getClassnum()==number){
                flag=true;
                b.setHeadteacher(t);
                System.out.println("班级信息更新成功");
                return;
            }
        }
        if(flag==false){
            System.out.println("没有这个班号的班级");
        }
    }
    //根据班号删除班级
    public void deleteClass(int num){
        boolean flag=false;
        for(int i=0;i<al.size();i++){
            Banji b= (Banji) al.get(i);
            if(b.getClassnum()==num){
                flag=true;
                al.remove(i);
                System.out.println("班级删除成功");
                return;
            }
        }
        if(flag==false){
            System.out.println("没有这个班号的班级");
        }
    }
    public void print(){
        System.out.println("全体班级列表为:");
        for(int i=0;i<al.size();i++) {
            Banji b= (Banji) al.get(i);
            b.print();
        }
    }
}
