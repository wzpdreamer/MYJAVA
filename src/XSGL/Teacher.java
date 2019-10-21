package XSGL;

public class Teacher {
    private String name;
    private String teacourse;
    public Teacher(){}
    public void setTeacourse(String c){teacourse = c;}
    public String getTeacourse(){return teacourse;}
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void print(){System.out.println(name+' '+teacourse);}
}
