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
    public void set(int index, Object obj); //�޸�ָ��λ������
    public void remove(Object data);    //ɾ������
    public void clear();    //�������
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
        //��һ�Σ�this = LinkImpl.root
        //�ڶ��Σ�this = LinkImpl.root.next
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

        public Object getNode(int index){
            if(LinkImpl.this.foot++ == index){
                return this.data;
            }else{
                return this.next.getNode(index);
            }
        }

        public void setNode(int index, Object data){
            if(LinkImpl.this.foot++ == index){
                this.data = data;
            }else{
                this.next.setNode(index, data);
            }
        }
        //��һ�Σ�this = LinkImpl.root.next previous = LinkImpl.root
        //�ڶ��Σ�this = LinkImpl.root.next.next    previous = LinkImpl.root.next
        public void removeNode(Node previous, Object data){
            if(this.data.equals(data)){ //Ϊ��ǰҪɾ��������
                previous.next = this.next;  //�ճ���ǰ�ڵ�
            }else{
                this.next.removeNode(this, data);
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
        if(index >= this.count){
            return null;
        }
        this.foot = 0;
        return this.root.getNode(index);
    }

    @Override
    public void set(int index, Object obj) {
        if(index >= this.count){
            return ;
        }
        this.foot = 0;
        this.root.setNode(index, obj);
    }

    @Override
    public void remove(Object data) {
        if(this.contains(data)){    //�������������ɾ��
            if(this.root.data.equals(data)){    //��Ԫ��ΪҪɾ���ĵ�Ԫ��
                this.root = this.root.next; //�ڶ���Ԫ����Ϊ��Ԫ��
            }else{  //���Ǹ�Ԫ�أ���Ԫ���ж�����
                this.root.next.removeNode(this.root, data);
            }
        }
        this.count--;
    }

    @Override
    public void clear() {
        this.root = null;
        this.count = 0;
    }
}
public class TestDemo4 {
    public static void main(String[] args) {
        LinkImpl all = new LinkImpl();
        all.add("��ͷ");
        all.add("����1");
        all.add("����2");
        all.remove("����1");
        System.out.println(all.get(1));
    }
}