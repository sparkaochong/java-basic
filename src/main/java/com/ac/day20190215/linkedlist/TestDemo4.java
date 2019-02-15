package com.ac.day20190215.linkedlist;

/**
 * Created by aochong Cotter on 2019/2/15.
 * ʹ���ڲ���Ľ�����
 */
interface Link{
    public void add(Object data);   //�򼯺���׷������
    public int size();  //ȡ�ü���Ԫ�صĳ���
    public boolean isEmpty();   //�ж��Ƿ�Ϊ�ռ���
    public boolean contains(Object obj);  //�ж��Ƿ����ָ����Ԫ��
    public Object get(int index);   //��������ȡ�����ݣ�������0��ʼ
}
class LinkImpl implements Link{
    private class Node{
        private Object data;
        private Node next;
        public Node(Object data){
            this.data = data;
        }

        public void addNode(Node newNode){
            if(this.next == null){
                this.next = newNode;
            }else{
                this.next.addNode(newNode);
            }
        }

        public boolean containsNode(Object obj){
            if(this.data.equals(obj)){
                return true;
            }else{
                if(this.next != null){
                    return this.next.containsNode(obj);
                }else{
                    return false;
                }
            }
        }
    }
    private Node root;
    private int count;
    private int foot = 0;

    @Override
    public void add(Object data) {
        if(data == null)    return;
        Node newNode = new Node(data);
        if(this.root == null){
            this.root = newNode;
        }else{
            this.root.addNode(newNode);
        }
        this.count ++;
    }

    @Override
    public int size() {
        return this.count;
    }

    @Override
    public boolean isEmpty() {
//        return this.count == 0;
        return this.root == null;
    }

    @Override
    public boolean contains(Object obj) {
        if(obj == null){
            return false;
        }else{
            return this.root.containsNode(obj);
        }
    }

    @Override
    public Object get(int index) {
        return null;
    }
}
public class TestDemo4 {
    public static void main(String[] args) {
        LinkImpl all = new LinkImpl();
        all.add("��ͷ");
        all.add("����1");
        all.add("����2");
        System.out.println(all.contains("aaa"));
    }
}