package com.ac.day20190305.reflex;

/**
 * @program: java-basic
 * @description: 反射改进工厂设计模式
 * @author: Mr.Ao
 * @create: 2019-03-05 15:20
 **/
interface Fruit1{
    public void eat();
}

class Apple1 implements Fruit1{
    @Override
    public void eat() {
        System.out.println("*** 吃苹果！ ***");
    }
}

class Orange1 implements Fruit1{
    @Override
    public void eat() {
        System.out.println("*** 吃橘子！ ***");
    }
}

class Factory1{
    public static Fruit1 getInstance(String name) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (Fruit1) Class.forName(name).newInstance();
    }
}

public class TestDemo6 {
    public static void main(String[] args) {
        Fruit1 f1 = null;
        try {
            f1 = Factory1.getInstance("com.ac.day20190305.reflex.Orange1");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        f1.eat();
    }
}
