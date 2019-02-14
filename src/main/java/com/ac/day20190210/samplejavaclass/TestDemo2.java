package com.ac.day20190210.samplejavaclass;

/**
 * Created by Chong Ao on 2019/2/10.
 */
public class TestDemo2 {
    public static void main(String[] args) {
        //第一步：设置类与类之间的关联关系
        //1.定义单独的类对象
        Student stu1 = new Student(01, "张三");
        Student stu2 = new Student(02, "李四");
        Student stu3 = new Student(03, "王二");
        Course c1 = new Course(1, "Oracle", 50, "-");
        Course c2 = new Course(2, "Java", 300, "-");
        //2.设置彼此的关系
        StudentCourse sc1 = new StudentCourse(stu1, c1, "暂无评价", 90.0);
        StudentCourse sc2 = new StudentCourse(stu1, c2, "暂无评价", 89.0);
        StudentCourse sc3 = new StudentCourse(stu2, c1, "暂无评价", 70.0);
        StudentCourse sc4 = new StudentCourse(stu3, c1, "暂无评价", 77.0);
        StudentCourse sc5 = new StudentCourse(stu3, c2, "暂无评价", 79.0);
        //3.在Student中设置关系
        stu1.setScs(new StudentCourse[]{sc1, sc2});
        stu2.setScs(new StudentCourse[]{sc3});
        stu3.setScs(new StudentCourse[]{sc4, sc5});
        //4.在Cource中设置关系
        c1.setScs(new StudentCourse[]{sc1, sc3, sc4});
        c2.setScs(new StudentCourse[]{sc2, sc5});
        //第二步：取得数据信息
        System.out.println(c1.toString());  //输出一个课程信息
        for(int x = 0 ;x<c1.getScs().length; x++){//选修该门课程的学生信息
            System.out.println("|- 【选修学生】" + c1.getScs()[x].getStudent().toString() + " 课程名称：" + c1.getCname() + " 考试成绩：" + c1.getScs()[x].getScore());
        }
        System.out.println("\n====================================\n");
        System.out.println(stu1.toString());    //输出一个学生信息
        for(int x = 0; x<stu1.getScs().length; x++){//该学生选修了哪几门课程
            System.out.println("|- 【选修课程】" + stu1.getScs()[x].getCourse().toString() + " 考试成绩：" + stu1.getScs()[x].getScore());
        }
    }
}
