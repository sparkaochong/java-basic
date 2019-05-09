package com.ac.day20190318.server;

import java.net.Socket;
import java.util.Scanner;

/**
 * @program: java-basic
 * @description: 客户端
 * @author: Mr.Ao
 * @create: 2019-03-19 09:07
 **/
public class HelloClient {
    public static void main(String[] args) throws Exception{
        Socket client = new Socket("localhost",9998);
        Scanner sc = new Scanner(client.getInputStream());
        if(sc.hasNext()){
            System.out.println("【服务器端回应数据】：" + sc.next());
        }
        sc.close();
        client.close();
    }
}
