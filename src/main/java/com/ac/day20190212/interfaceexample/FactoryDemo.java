package com.ac.day20190212.interfaceexample;

/**
 * Created by aochong Cotter on 2019/2/14.
 * �������ģʽ����
 */
interface Fruit{
    public void eat();
}
class Apple implements Fruit{
    @Override
    public void eat() {
        System.out.println("��ƻ����");
    }
}
class Cherry implements Fruit{
    @Override
    public void eat() {
        System.out.println("��ӣ�ң�");
    }
}
class Factory{
    public static Fruit getInstance(String className){
        if("apple".equals(className)){
            return new Apple();
        }else if("cherry".equals(className)){
            return new Cherry();
        }else {
            return null;
        }
    }
}
public class FactoryDemo {
    public static void main(String[] args) {
        Fruit f = Factory.getInstance(args[0]);
        if(f != null){
            f.eat();
        }
    }
}
