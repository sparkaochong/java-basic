package com.ac.day20190309.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Date;

/**
 * @program: java-basic
 * @description: Statement接口实现批处理并增加事务控制
 * @author: Mr.Ao
 * @create: 2019-03-09 10:16
 **/
public class TestDemo12 {
    public static final String DBDRIVER = "oracle.jdbc.driver.OracleDriver";
    public static final String DBURL = "jdbc:oracle:thin:@10.33.3.6:1521:orcl";
    public static final String USERNAME = "scott";
    public static final String PASSWORD = "tiger";

    public static void main(String[] args) throws Exception{
        Date birthday = new Date();
        //第一步：加载数据库驱动程序
        Class.forName(DBDRIVER);
        //第二步：取得数据库连接对象
        Connection conn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
        conn.setAutoCommit(false);
        //第三步：进行数据库的数据操作
        String sql = "INSERT INTO MEMBER(MID,NAME,AGE,BIRTHDAY,NOTE) VALUES(myseq.nextval,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        for(int x=0;x<100;x++){
            pstmt.setString(1,"张三");
            pstmt.setInt(2,20);
            pstmt.setDate(3,new java.sql.Date(birthday.getTime()));
            pstmt.setString(4,"是一个帅哥");
            pstmt.addBatch();
        }
        int[] result = pstmt.executeBatch();
        System.out.println(Arrays.toString(result));
        //第四步：关闭数据库连接
        conn.close();
    }
}
