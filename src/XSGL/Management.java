package XSGL;

import java.util.Scanner;

public class Management {
    public static void main(String[] args){
        StudentManage stumanage = new StudentManage();
        TeacherManage teamanage = new TeacherManage();
        CourseManage coumanage = new CourseManage();
        BanjiManage bjmanage = new BanjiManage();
        Student s= new Student();
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();
        Course c = new Course();
        Banji b = new Banji();
        s.setName("武智鹏");
        s.setGrade(2017);
        s.setStubjnum(17070144);
        stumanage.addStu(s);
        stumanage.Applystunum(s);
        stumanage.print();
        stumanage.updateStu(1,1707004718,"武智鹏",2017,17070144);
        stumanage.print();
        t1.setName("张建华");
        t1.setTeacourse("Java程序设计");
        t2.setName("崔媛");
        teamanage.addTea(t1);
        teamanage.addTea(t2);
        c.setCoursename("Java程序设计");
        c.setCoubjnum(17070144);
        c.setInstructor("张建华");
        coumanage.addCou(c);
        b.setClassnum(17070144);
        b.setHeadteacher(t2);
        b.bjaddStu(s);
        b.bjaddCou(c);
        bjmanage.addClass(b);
        stumanage.print();
        teamanage.print();
        coumanage.print();
        bjmanage.print();
        stumanage.isgraduated("yes",s);
        stumanage.print();
    }
}
