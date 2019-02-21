package com.ac.day20190221.genericity;

/**
 * Created by Chong Ao on 2019/2/21.
 * 引出泛型
 */
class Point{
    private Object x;
    private Object y;

    public Point(){}

    public Point(Object x, Object y) {
        this.x = x;
        this.y = y;
    }

    public Object getX() {
        return x;
    }

    public void setX(Object x) {
        this.x = x;
    }

    public Object getY() {
        return y;
    }

    public void setY(Object y) {
        this.y = y;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Point p = new Point();
        p.setX(100);    //理论上要保存String
        p.setY("北纬30度");
        String x = (String)p.getX();
        String y = (String)p.getY();
        System.out.println("x = " + x + " y = " + y);
    }
}
