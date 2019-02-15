package com.ac.day20190215.linkedlist;

/**
 * Created by aochong Cotter on 2019/2/15.
 * 递归遍历节点
 */
class Node2{ //表示定义的节点
    private Object data;    //保存的数据
    private Node2 next;      //保存下一个节点
    public Node2(Object data){//有数据才可以保存节点
        this.data = data;
    }
    public void setNext(Node2 next){//设置节点
        this.next = next;
    }

    public Node2 getNext(){//取得节点
        return this.next;
    }

    public void setData(Object data){
        this.data = data;
    }

    public Object getData(){
        return this.data;
    }

    //第一次调用：this = Linked.root
    //第二次调用：this = Linked.root.next
    //第三次调用：this = Linked.root.next.next
    public void addNode(Node2 node){
        if(this.next == null){//当前节点之后没有节点了
            this.next = node;
        }else{//如果当前节点之后有节点
            this.next.addNode(node);
        }
    }

    //第一次调用：this = Linked.root
    //第二次调用：this = Linked.root.next
    //第三次调用：this = Linked.root.next.next
    public void printNode(){
        System.out.println(this.data);
        if(this.next != null){//还有后续节点
            this.next.printNode();
        }
    }
}
class Linked{
    private Node2 root;
    public void add(Object obj){//向链表里面追加数据
        //将要操作的数据包装为Node类对象，这样才可以进行先后关系的排列
        Node2 newNode = new Node2(obj);
        //现在没有根节点
        if(this.root == null){
            this.root = newNode;    //将第一个节点作为根节点
        }else {//根节点存在了，交由Node类进行处理
            this.root.addNode(newNode);//由根节点负责调用，因为已经存在根节点了
        }
    }
    public void print(){//取得链表全部数据
        if(this.root != null){//现在有数据
            this.root.printNode();
        }
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        Linked all = new Linked();
        all.add("商品1");
        all.add("商品2");
        all.add("商品3");
        all.print();
    }
}