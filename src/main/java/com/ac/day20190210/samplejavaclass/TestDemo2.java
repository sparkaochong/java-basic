package com.ac.day20190210.samplejavaclass;

/**
 * Created by Chong Ao on 2019/2/10.
 */
public class TestDemo2 {
    public static void main(String[] args) {
        //��һ��������������֮��Ĺ�����ϵ
        //1.���嵥���������
        Student stu1 = new Student(01, "����");
        Student stu2 = new Student(02, "����");
        Student stu3 = new Student(03, "����");
        Course c1 = new Course(1, "Oracle", 50, "-");
        Course c2 = new Course(2, "Java", 300, "-");
        //2.���ñ˴˵Ĺ�ϵ
        StudentCourse sc1 = new StudentCourse(stu1, c1, "��������", 90.0);
        StudentCourse sc2 = new StudentCourse(stu1, c2, "��������", 89.0);
        StudentCourse sc3 = new StudentCourse(stu2, c1, "��������", 70.0);
        StudentCourse sc4 = new StudentCourse(stu3, c1, "��������", 77.0);
        StudentCourse sc5 = new StudentCourse(stu3, c2, "��������", 79.0);
        //3.��Student�����ù�ϵ
        stu1.setScs(new StudentCourse[]{sc1, sc2});
        stu2.setScs(new StudentCourse[]{sc3});
        stu3.setScs(new StudentCourse[]{sc4, sc5});
        //4.��Cource�����ù�ϵ
        c1.setScs(new StudentCourse[]{sc1, sc3, sc4});
        c2.setScs(new StudentCourse[]{sc2, sc5});
        //�ڶ�����ȡ��������Ϣ
        System.out.println(c1.toString());  //���һ���γ���Ϣ
        for(int x = 0 ;x<c1.getScs().length; x++){//ѡ�޸��ſγ̵�ѧ����Ϣ
            System.out.println("|- ��ѡ��ѧ����" + c1.getScs()[x].getStudent().toString() + " �γ����ƣ�" + c1.getCname() + " ���Գɼ���" + c1.getScs()[x].getScore());
        }
        System.out.println("\n====================================\n");
        System.out.println(stu1.toString());    //���һ��ѧ����Ϣ
        for(int x = 0; x<stu1.getScs().length; x++){//��ѧ��ѡ�����ļ��ſγ�
            System.out.println("|- ��ѡ�޿γ̡�" + stu1.getScs()[x].getCourse().toString() + " ���Գɼ���" + stu1.getScs()[x].getScore());
        }
    }
}
