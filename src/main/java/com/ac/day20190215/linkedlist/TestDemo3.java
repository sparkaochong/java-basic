package com.ac.day20190215.linkedlist;

/**
 * Created by aochong Cotter on 2019/2/15.
 * �ݹ�����ڵ�
 */
class Node2{ //��ʾ����Ľڵ�
    private Object data;    //���������
    private Node2 next;      //������һ���ڵ�
    public Node2(Object data){//�����ݲſ��Ա���ڵ�
        this.data = data;
    }
    public void setNext(Node2 next){//���ýڵ�
        this.next = next;
    }

    public Node2 getNext(){//ȡ�ýڵ�
        return this.next;
    }

    public void setData(Object data){
        this.data = data;
    }

    public Object getData(){
        return this.data;
    }

    //��һ�ε��ã�this = Linked.root
    //�ڶ��ε��ã�this = Linked.root.next
    //�����ε��ã�this = Linked.root.next.next
    public void addNode(Node2 node){
        if(this.next == null){//��ǰ�ڵ�֮��û�нڵ���
            this.next = node;
        }else{//�����ǰ�ڵ�֮���нڵ�
            this.next.addNode(node);
        }
    }

    //��һ�ε��ã�this = Linked.root
    //�ڶ��ε��ã�this = Linked.root.next
    //�����ε��ã�this = Linked.root.next.next
    public void printNode(){
        System.out.println(this.data);
        if(this.next != null){//���к����ڵ�
            this.next.printNode();
        }
    }
}
class Linked{
    private Node2 root;
    public void add(Object obj){//����������׷������
        //��Ҫ���������ݰ�װΪNode����������ſ��Խ����Ⱥ��ϵ������
        Node2 newNode = new Node2(obj);
        //����û�и��ڵ�
        if(this.root == null){
            this.root = newNode;    //����һ���ڵ���Ϊ���ڵ�
        }else {//���ڵ�����ˣ�����Node����д���
            this.root.addNode(newNode);//�ɸ��ڵ㸺����ã���Ϊ�Ѿ����ڸ��ڵ���
        }
    }
    public void print(){//ȡ������ȫ������
        if(this.root != null){//����������
            this.root.printNode();
        }
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        Linked all = new Linked();
        all.add("��Ʒ1");
        all.add("��Ʒ2");
        all.add("��Ʒ3");
        all.print();
    }
}