package com.ac.day20190221.multitionpattern;

/**
 * Created by Chong Ao on 2019/2/21.
 * 枚举中定义抽象方法
 */
enum Color8{
    RED("红色"){
        public String getColor() {
            return "红色";
        }
    },BLUE("蓝色"){
        public String getColor() {
            return "蓝色";
        }
    },GREEN("绿色"){
        public String getColor() {
            return "绿色";
        }
    }; //枚举对象必须写在首行
    private String title;   //定义属性
    private Color8(String title){   //构造方法必须私有化，使用非public
        this.title = title;
    }
    public String toString(){
        return this.title;
    }
    public abstract String getColor();
}
public class TestDemo8 {
    public static void main(String[] args) {
        System.out.println(Color8.BLUE.getColor());
    }
}
