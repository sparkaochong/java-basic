package com.ac.day20190221.multitionpattern;

/**
 * Created by Chong Ao on 2019/2/21.
 * 模式二：枚举对象采用匿名内部类的方式实现接口
 */
interface IMessage1{
    public String getColor();
}
enum Color7 implements IMessage1{
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
    private Color7(String title){   //构造方法必须私有化，使用非public
        this.title = title;
    }
    public String toString(){
        return this.title;
    }
}
public class TestDemo7 {
    public static void main(String[] args) {
        IMessage1 msg = Color7.RED;
        System.out.println(msg.getColor());
    }
}
