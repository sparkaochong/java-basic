package com.ac.day20190210.samplejavaclass;

/**
 * Created by Chong Ao on 2019/2/10.
 */
public class StudentCourse {
    private Student student; //学生信息
    private Course course;   //学生选修的课程信息
    private String evaluate; //课程评价
    private double score;   //课程考试成绩

    public StudentCourse(){}

    public StudentCourse(Student student, Course course, String evaluate, double score) {
        this.student = student;
        this.course = course;
        this.evaluate = evaluate;
        this.score = score;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "StudentCourse{" +
                "student=" + student +
                ", course=" + course +
                ", evaluate='" + evaluate + '\'' +
                ", score=" + score +
                '}';
    }
}
