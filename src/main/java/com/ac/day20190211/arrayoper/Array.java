package com.ac.day20190211.arrayoper;

/**
 * Created by Chong Ao on 2019/2/11.
 * 数组操作类
 */
public class Array {
    private int [] data;
    private int foot;   //作为保存脚标

    public Array(int len){  //实例化本类时必须设置数组的长度
        if(len <= 0) this.data = new int[1];    //至少维持一个长度的数组
        this.data = new int[len];   //根据传入的长度定义数组的长度
    }

    public boolean add(int num){    //如果保存成功返回true，否则返回false
        if(this.foot < this.data.length){
            this.data[this.foot++] = num;
            return true;
        }
        return false;
    }

    public int[] getData(){
        return this.data;
    }

    public void Inc(int size){
        if(size > 0){
            int[] newData = new int[size + this.data.length];
            System.arraycopy(this.data, 0 , newData, 0, this.data.length);
            this.data = newData;    //改变引用
        }
    }
}
