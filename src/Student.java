import java.util.ArrayList;

public class Student{
    private String name;
    private int stunum;
    private int grade;
    private String titleofpaper;
    private boolean isgraduatestu = false;
    private int stubjnum;
    public void setName(String n){ name = n; }
    public void setStunum(int n){stunum = n;}
    public void setTitleofpaper(String t){
        titleofpaper = t;
    }
    public void setIsgraduatestu(){
        isgraduatestu = true;
    }
    public void setStubjnum(int b){stubjnum=b;}
    public void setGrade(int g){ grade = g; }
    public int getStunum(){ return stunum; }
    public String getName(){return name;}
    public int getGrade(){return grade;}
    public String getTitleofpaper(){
        return titleofpaper;
    }
    public boolean getIsgrastu() {
        return isgraduatestu;
    }
    public int getStubjnum(){return stubjnum;}
    public void print(){
        System.out.println(stunum+" "+name+' '+grade+' '+stubjnum);
    }
}
