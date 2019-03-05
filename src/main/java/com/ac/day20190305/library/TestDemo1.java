package com.ac.day20190305.library;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @program: java-basic
 * @description: 定时调度
 * @author: Mr.Ao
 * @create: 2019-03-05 20:35
 **/
class MyTask extends TimerTask {

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:ss:SSS");
        System.out.println("当前系统日期时间：" + sdf.format(new Date()));
    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new MyTask(),1000,3000);
    }
}
