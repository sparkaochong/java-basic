package com.ac.day20190211.arrayoper;

/**
 * Created by Chong Ao on 2019/2/11.
 * ���������
 */
public class Array {
    private int [] data;
    private int foot;   //��Ϊ����ű�

    public Array(int len){  //ʵ��������ʱ������������ĳ���
        if(len <= 0) this.data = new int[1];    //����ά��һ�����ȵ�����
        this.data = new int[len];   //���ݴ���ĳ��ȶ�������ĳ���
    }

    public boolean add(int num){    //�������ɹ�����true�����򷵻�false
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
            this.data = newData;    //�ı�����
        }
    }
}
