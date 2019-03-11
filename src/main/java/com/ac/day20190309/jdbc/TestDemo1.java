package com.ac.day20190309.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @program: java-basic
 * @description: 数据库更新操作
 * @author: Mr.Ao
 * @create: 2019-03-09 10:16
 **/
public class TestDemo1 {
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
        String insert = "INSERT INTO member(mid,name,age,birthday,note) VALUES(myseq.nextval,'张三',10,TO_DATE('1989-10-10','yyyy-MM-dd'),'是一个人')";
        String update = "UPDATE member SET NAME='李四',birthday=SYSDATE WHERE MID IN(2,3,4,5,6,7,8,9)";
        String delete = "DELETE FROM MEMBER WHERE MID BETWEEN 11 AND 20";
        int len = stmt.executeUpdate(delete);
        System.out.println("影响的数据行数：" + len);
        //第四步：关闭数据库连接
        conn.close();
    }
}
