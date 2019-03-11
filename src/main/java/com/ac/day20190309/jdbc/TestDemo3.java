package com.ac.day20190309.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

/**
 * @program: java-basic
 * @description: Statement接口存在问题
 * @author: Mr.Ao
 * @create: 2019-03-09 10:16
 **/
public class TestDemo3 {
    public static final String DBDRIVER = "oracle.jdbc.driver.OracleDriver";
    public static final String DBURL = "jdbc:oracle:thin:@10.33.3.6:1521:orcl";
    public static final String USERNAME = "scott";
    public static final String PASSWORD = "tiger";

    public static void main(String[] args) throws Exception{
        String name = "麻子";
        int age = 20;
        String birthday = "2019-03-11";
        String note = "是一个帅哥";
        //第一步：加载数据库驱动程序
        Class.forName(DBDRIVER);
        //第二步：取得数据库连接对象
        Connection conn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
        //第三步：进行数据库的数据操作
        Statement stmt = conn.createStatement();
        String sql = "INSERT INTO member(mid,name,age,birthday,note) " +
                "VALUES(myseq.nextval,'" + name + "','"+ age + "',TO_DATE('" + birthday + "','yyyy-MM-dd'),'" +note+"')" ;
        System.out.println(sql);
        System.out.println(stmt.executeUpdate(sql));
        //第四步：关闭数据库连接
        conn.close();
    }
}
