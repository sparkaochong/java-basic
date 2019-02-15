package com.ac.day20190215.linkedlist;

/**
 * Created by aochong Cotter on 2019/2/15.
 * 递归遍历节点
 */
class Node1{ //表示定义的节点
    private Object data;    //保存的数据
    private Node next;      //保存下一个节点
    public Node1(Object data){//有数据才可以保存节点
        this.data = data;
    }
    public void setNext(Node next){//设置节点
        this.next = next;
    }

    public Node getNext(){//取得节点
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
        //1.定义各自独立的操作节点
        Node root = new Node("火车头");
        Node node1 = new Node("车厢1");
        Node node2 = new Node("车厢2");
        //2.设置彼此间的关系
        root.setNext(node1);
        node1.setNext(node2);
        //3.输出
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
