package com.ac.day20190214.objectclass;

/**
 * Created by aochong Cotter on 2019/2/14.
 * ����Object���������
 */
public class TestDemo4 {
    public static void main(String[] args) {
        Object obj = new int[]{1,2,3};  //����Object�����int��������
        if(obj instanceof int[]){
            int data[] = (int [])obj;
            for(int x = 0;x<data.length;x++){
                System.out.println(data[x]);
            }
        }
    }
}
