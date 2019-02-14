package com.ac.day20190212.interfaceexample;

/**
 * @ClassName TestDemo
 * @Description ≥Ã–Ú≤‚ ‘
 * @Author aochong
 * @Date 2019/2/14 16:32
 * @VERSION 1.0
 **/
public class TestDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.plugin(new Flash());
        computer.plugin(new KeyBoard());
    }
}
