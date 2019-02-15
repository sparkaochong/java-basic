package com.ac.day20190215.linkedlist;

/**
 * Created by aochong Cotter on 2019/2/15.
 * ѭ�������ڵ�
 */
class Node{ //��ʾ����Ľڵ�
    private Object data;    //���������
    private Node next;      //������һ���ڵ�
    public Node(Object data){//�����ݲſ��Ա���ڵ�
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
public class TestDemo1 {
    public static void main(String[] args) {
        //1.������Զ����Ĳ����ڵ�
        Node root = new Node("��ͷ");
        Node node1 = new Node("����1");
        Node node2 = new Node("����2");
        //2.���ñ˴˼�Ĺ�ϵ
        root.setNext(node1);
        node1.setNext(node2);
        //3.���
        Node currNode = root;//�Ӹ��ڵ㿪ʼȡ����
        while(currNode != null){//�ж��Ƿ��нڵ�
            System.out.println(currNode.getData()); //ȡ������
            currNode = currNode.getNext();  //ָ��ָ����һ���ڵ�
        }
    }
}
