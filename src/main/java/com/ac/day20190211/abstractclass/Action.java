package com.ac.day20190211.abstractclass;

/**
 * Created by Chong Ao on 2019/2/11.
 * ģ�����ģʽ����
 */
public abstract class Action {//���������Ϊ����Ϊһ�����Ǿ����
    public static final int EAT = 1;
    public static final int SLEEP = 2;
    public static final int WORK = 5;
    public void command(int flag){//ִ������
        switch (flag){//��ֵ���ж���switch����õ�
            case EAT : {
                this.eat();
                break;
            }
            case SLEEP : {
                this.sleep();
                break;
            }
            case WORK : {
                this.work();
                break;
            }
        }
    }
    //��Ϊ��Щ�������Ϊ���ִ�в�֪������Ҫ�����������ʵ��������
    public abstract void eat();
    public abstract void sleep();
    public abstract void work();
}
