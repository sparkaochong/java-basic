package com.ac.day20190219.singletonpattern;

/**
 * Created by aochong Cotter on 2019/2/20.
 * 多例设计模式
 */
class Sex{
    public static final int MALE_CH = 1;
    public static final int FEMALE_CH = 2;
    public static final Sex MALE = new Sex("男");
    public static final Sex FEMALE = new Sex("女");
    private String title;
    private Sex(String title){
        this.title = title;
    }

    public static Sex getInstance(int ch){
        switch(ch){
            case MALE_CH :
                return MALE;
            case FEMALE_CH :
                return FEMALE;
            default:
                return null;
        }
    }

    public String toString(){
        return this.title;
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        Sex sex = Sex.getInstance(Sex.FEMALE_CH);
        System.out.println(sex);
    }
}
