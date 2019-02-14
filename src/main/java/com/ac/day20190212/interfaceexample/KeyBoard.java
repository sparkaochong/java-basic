package com.ac.day20190212.interfaceexample;

/**
 * Created by aochong Cotter on 2019/2/14.
 * 键盘实体类
 */
public class KeyBoard implements USB{
    @Override
    public void start() {
        System.out.println("键盘设备开始工作！");
    }

    @Override
    public void stop() {
        System.out.println("键盘设备停止工作！");
    }
}
