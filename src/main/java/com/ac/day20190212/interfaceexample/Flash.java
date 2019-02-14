package com.ac.day20190212.interfaceexample;

/**
 * Created by aochong Cotter on 2019/2/14.
 * U盘设备实体类
 */
public class Flash implements USB{
    @Override
    public void start() {
        System.out.println("U盘设备开始工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘设备停止工作");
    }
}
