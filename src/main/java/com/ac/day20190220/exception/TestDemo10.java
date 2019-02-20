package com.ac.day20190220.exception;

/**
 * Created by aochong Cotter on 2019/2/20.
 */
class ScoreException extends Exception{
    public ScoreException(String msg){
        super(msg);
    }
}
public class TestDemo10 {
    public static void main(String[] args) throws Exception{
        double score = 102.5;
        if(score>100.0){
            throw new ScoreException("成绩大于100分了！");
        }
    }
}
