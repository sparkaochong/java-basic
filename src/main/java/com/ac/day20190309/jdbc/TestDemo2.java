package com.ac.day20190309.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

/**
 * @program: java-basic
 * @description: 数据库查询操作
 * @author: Mr.Ao
 * @create: 2019-03-09 10:16
 **/
public class TestDemo2 {
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
        Statement stmt = conn.createStatement();
        //以后开发代码中不允许写“*”
        String query = "SELECT mid,name,age,birthday,note FROM member";
        //数据库查询操作
        ResultSet rs = stmt.executeQuery(query);
        //知道循环结束条件，但是不知道循环次数，选择while循环
        while(rs.next()){//移动指针同时判断是否还有数据
            int mid = rs.getInt(1);
            String name = rs.getString(2);
            int age = rs.getInt(3);
            Date birthday = rs.getDate(4);
            String note = rs.getString(5);
            System.out.println("mid = " + mid + ",name = " + name + ",age = " + age + ",birthday = " + birthday + ",note = " + note);
        }
        //第四步：关闭数据库连接
        conn.close();
    }
}
