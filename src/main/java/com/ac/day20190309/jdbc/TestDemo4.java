package com.ac.day20190309.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Date;

/**
 * @program: java-basic
 * @description: PreparedStatement接口改进
 * @author: Mr.Ao
 * @create: 2019-03-09 10:16
 **/
public class TestDemo4 {
    public static final String DBDRIVER = "oracle.jdbc.driver.OracleDriver";
    public static final String DBURL = "jdbc:oracle:thin:@10.33.3.6:1521:orcl";
    public static final String USERNAME = "scott";
    public static final String PASSWORD = "tiger";

    public static void main(String[] args) throws Exception{
        String name = "Mr'SMITH";
        int age = 20;
        Date birthday = new Date();
        String note = "是一个帅哥";
        //第一步：加载数据库驱动程序
        Class.forName(DBDRIVER);
        //第二步：取得数据库连接对象
        Connection conn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
        //第三步：进行数据库的数据操作
        String sql = "INSERT INTO member(mid,name,age,birthday,note) " +
                "VALUES(myseq.nextval,?,?,?,?)" ;
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,name);
        pstmt.setInt(2,age);
        pstmt.setDate(3,new java.sql.Date(birthday.getTime()));
        pstmt.setString(4,note);
        System.out.println(pstmt.executeUpdate());
        //第四步：关闭数据库连接
        conn.close();
    }
}
