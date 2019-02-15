package com.ac.day20190215.linkedlist;

/**
 * Created by aochong Cotter on 2019/2/15.
 * �ݹ�����ڵ�
 */
class Node1{ //��ʾ����Ľڵ�
    private Object data;    //���������
    private Node next;      //������һ���ڵ�
    public Node1(Object data){//�����ݲſ��Ա���ڵ�
        this.data = data;
    }
    public void setNext(Node next){//���ýڵ�
        this.next = next;
    }

    public Node getNext(){//ȡ�ýڵ�
        return this.next;
    }

    public void setData(Object data){
        this.data = data;
    }
    public Object getData(){
        return this.data;
    }
}

public class TestDemo2 {
    public static void main(String[] args) {
        //1.������Զ����Ĳ����ڵ�
        Node root = new Node("��ͷ");
        Node node1 = new Node("����1");
        Node node2 = new Node("����2");
        //2.���ñ˴˼�Ĺ�ϵ
        root.setNext(node1);
        node1.setNext(node2);
        //3.���
        print(root);
    }

    public static void print(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.getData());
        print(node.getNext());
    }
}
