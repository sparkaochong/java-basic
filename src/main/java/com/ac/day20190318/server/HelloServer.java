package com.ac.day20190318.server;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program: java-basic
 * @description: 服务器端
 * @author: Mr.Ao
 * @create: 2019-03-19 09:01
 **/
public class HelloServer {
    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(9998);
        System.out.println("等待客户端连接");
        Socket client = server.accept();
        PrintStream ps = new PrintStream(client.getOutputStream());
        ps.println("hello world");
        ps.close();
        server.close();
    }
}
