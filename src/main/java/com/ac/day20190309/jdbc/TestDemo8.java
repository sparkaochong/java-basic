package com.ac.day20190309.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

/**
 * @program: java-basic
 * @description: PreparedStatement分页查询
 * @author: Mr.Ao
 * @create: 2019-03-09 10:16
 **/
public class TestDemo8 {
    public static final String DBDRIVER = "oracle.jdbc.driver.OracleDriver";
    public static final String DBURL = "jdbc:oracle:thin:@10.33.3.6:1521:orcl";
    public static final String USERNAME = "scott";
    public static final String PASSWORD = "tiger";

    public static void main(String[] args) throws Exception{
        String keyWord = "张";
        int currentPage = 2;
        int pageSize = 5;
        //第一步：加载数据库驱动程序
        Class.forName(DBDRIVER);
        //第二步：取得数据库连接对象
        Connection conn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
        //第三步：进行数据库的数据操作
        String sql = "SELECT * FROM (" +
                " SELECT mid,name,age,birthday,note,ROWNUM rn " +
                " FROM member " +
                " WHERE name LIKE ? AND ROWNUM<=? )temp " +
                " WHERE temp.rn>? ";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,"%"+keyWord+"%");
        pstmt.setInt(2,currentPage * pageSize);
        pstmt.setInt(3,(currentPage-1) * pageSize);
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
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
