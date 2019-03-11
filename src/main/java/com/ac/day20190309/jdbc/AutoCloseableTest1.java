package com.ac.day20190309.jdbc;

/**
 * @program: java-basic
 * @description: AutoCloseable接口测试
 * @author: Mr.Ao
 * @create: 2019-03-09 10:44
 **/
class DataBase1 implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("该数据库的资源已经正常释放了！");
    }
    public void print(){
        System.out.println("Hello World!");
    }
}

public class AutoCloseableTest1{
    public static void main(String[] args){
       try(DataBase1 db = new DataBase1()){
            db.print();
       }catch(Exception e){
           e.printStackTrace();
       }
    }
}
