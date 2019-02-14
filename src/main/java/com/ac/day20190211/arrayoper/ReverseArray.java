package com.ac.day20190211.arrayoper;

/**
 * Created by Chong Ao on 2019/2/11.
 */
public class ReverseArray extends Array {
    public ReverseArray(int len) {
        super(len);
    }

    @Override
    public int[] getData() {
        int center = super.getData().length / 2;
        int head = 0;
        int tail = super.getData().length - 1;
        for(int x = 0;x < center; x++){
            int temp = super.getData()[head];
            super.getData()[head] = super.getData()[tail];
            super.getData()[tail] = temp;
            head ++;
            tail --;
        }
        return super.getData();
    }
}
