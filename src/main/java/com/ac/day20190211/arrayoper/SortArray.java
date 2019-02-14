package com.ac.day20190211.arrayoper;

import java.util.Arrays;

/**
 * Created by Chong Ao on 2019/2/11.
 */
public class SortArray  extends Array{

    public SortArray(int len) {
        super(len);
    }

    @Override
    public int[] getData() {
        Arrays.sort(super.getData());
        return super.getData();
    }
}
