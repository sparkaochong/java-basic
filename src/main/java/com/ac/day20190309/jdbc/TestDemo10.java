package com.ac.day20190309.jdbc;

import java.sql.*;
import java.util.Arrays;

/**
 * @program: java-basic
 * @description: Statement接口实现批处理
 * @author: Mr.Ao
 * @create: 2019-03-09 10:16
 **/
public class TestDemo10 {
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
        stmt.addBatch("INSERT INTO MEMBER(MID,NAME,AGE,BIRTHDAY,NOTE) VALUES(myseq.nextval,'李四',20,SYSDATE,'是一个帅哥')");
        stmt.addBatch("INSERT INTO MEMBER(MID,NAME,AGE,BIRTHDAY,NOTE) VALUES(myseq.nextval,'李四',20,SYSDATE,'是一个帅哥')");
        stmt.addBatch("INSERT INTO MEMBER(MID,NAME,AGE,BIRTHDAY,NOTE) VALUES(myseq.nextval,'李四',20,SYSDATE,'是一个帅哥')");
        stmt.addBatch("INSERT INTO MEMBER(MID,NAME,AGE,BIRTHDAY,NOTE) VALUES(myseq.nextval,'李四',20,SYSDATE,'是一个帅哥')");
        stmt.addBatch("INSERT INTO MEMBER(MID,NAME,AGE,BIRTHDAY,NOTE) VALUES(myseq.nextval,'李四',20,SYSDATE,'是一个帅哥')");
        int[] result = stmt.executeBatch();
        System.out.println(Arrays.toString(result));
        //第四步：关闭数据库连接
        conn.close();
    }
}
