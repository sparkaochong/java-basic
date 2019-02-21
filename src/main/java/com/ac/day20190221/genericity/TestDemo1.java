package com.ac.day20190221.genericity;

/**
 * Created by Chong Ao on 2019/2/21.
 * 使用泛型
 */
class Point1<T>{    //T:type P: param R: return
    private T x;
    private T y;

    public Point1(){}

    public Point1(T x, T y) {
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
public class TestDemo1 {
    public static void main(String[] args) {
        Point1<String> p = new Point1<String>();
        p.setX("东经100度");
        p.setY("北纬30度");
        String x = p.getX();
        String y = p.getY();
        System.out.println("x = " + x + " y = " + y);
    }
}
