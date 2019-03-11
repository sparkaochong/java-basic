package com.ac.day20190309.jdbc;

/**
 * @program: java-basic
 * @description: AutoCloseable接口测试
 * @author: Mr.Ao
 * @create: 2019-03-09 10:44
 **/
class DataBase implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("该数据库的资源已经正常释放了！");
    }
}
public class AutoCloseableTest{
    public static void main(String[] args) throws Exception{
        DataBase db = new DataBase();
        db = null;
        System.gc();
        Thread.sleep(1000);
    }
}
