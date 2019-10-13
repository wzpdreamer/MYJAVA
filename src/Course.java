import java.util.ArrayList;
public class Course {
    private String coursename;
    private String instructor;//任课老师
    private int coubjnum;//上这门课的班级
    public void setCoursename(String c){
        coursename = c;
    }
    public void setInstructor(String t){
        instructor = t;
    }
    public void setCoubjnum(int b){
        coubjnum = b;
    }
    public String getCoursename(){return coursename;}
    public String getInstructor(){return instructor;}
    public int getCoubjnum(){return coubjnum;}
    public void print(){System.out.println(coursename+' '+instructor+' '+coubjnum);}
}
