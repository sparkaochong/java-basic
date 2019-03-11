package com.ac.day20190309.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

/**
 * @program: java-basic
 * @description: PreparedStatement限定MID查询
 * @author: Mr.Ao
 * @create: 2019-03-09 10:16
 **/
public class TestDemo6 {
    public static final String DBDRIVER = "oracle.jdbc.driver.OracleDriver";
    public static final String DBURL = "jdbc:oracle:thin:@10.33.3.6:1521:orcl";
    public static final String USERNAME = "scott";
    public static final String PASSWORD = "tiger";

    public static void main(String[] args) throws Exception{
        //第一步：加载数据库驱动程序
        Class.forName(DBDRIVER);
        //第二步：取得数据库连接对象
        Connection conn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
        //第三步：进行数据库的数据操作
        String sql = "SELECT MID,NAME,AGE,BIRTHDAY,NOTE FROM MEMBER WHERE MID=?" ;
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1,21);
        ResultSet rs = pstmt.executeQuery();
        if(rs.next()){
            int mid = rs.getInt(1);
            String name = rs.getString(2);
            int age = rs.getInt(3);
            Date birthday = rs.getDate(4);
            String note = rs.getString(5);
            System.out.println("mid = " + mid + ",name = " + name + ",age = " + age + ",birthday = " + birthday + ",note = " + note);
        }else{
            System.out.println("您查询的结果不存在！");
        }        //第四步：关闭数据库连接
        conn.close();
    }
}
