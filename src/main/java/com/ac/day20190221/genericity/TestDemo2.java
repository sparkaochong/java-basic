package com.ac.day20190221.genericity;

/**
 * Created by Chong Ao on 2019/2/21.
 * ·ºÐÍ
 */
class Point2<T>{    //T:type P: param R: return
    private T x;
    private T y;

    public Point2(){}

    public Point2(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        Point2 p = new Point2();
        p.setX(100);
        p.setY("±±Î³30¶È");
        String x = (String) p.getX();
        String y = (String) p.getY();
        System.out.println("x =" + x + " y =" + y);
    }
}
