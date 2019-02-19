package com.ac.day20190215.linkedlist;

/**
 * Created by aochong Cotter on 2019/2/15.
 * 使用内部类改进程序
 */
interface Link{
    public void add(Object data);   //向集合中追加数据
    public int size();  //取得集合元素的长度
    public boolean isEmpty();   //判断是否为空集合
    public boolean contains(Object obj);  //判断是否包含指定的元素
    public Object get(int index);   //根据索引取出数据，索引从0开始
    public void set(int index, Object obj); //修改指定位置数据
    public void remove(Object data);    //删除数据
    public void clear();    //清空链表
    public Object[] toArray();  //返回对象数组
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
        //第一次：this = LinkImpl.root
        //第二次：this = LinkImpl.root.next
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
        //第一次：this = LinkImpl.root.next previous = LinkImpl.root
        //第二次：this = LinkImpl.root.next.next    previous = LinkImpl.root.next
        public void removeNode(Node previous, Object data){
            if(this.data.equals(data)){ //为当前要删除的数据
                previous.next = this.next;  //空出当前节点
            }else{
                this.next.removeNode(this, data);
            }
        }

        public void toArrayNode(){
            LinkImpl.this.retData[LinkImpl.this.foot++] = this.data;
            if(this.next != null)   this.next.toArrayNode();
        }

    }
    private Node root;
    private int count;
    private int foot = 0;
    private Object[] retData = null;

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
        if(this.contains(data)){    //数据如果存在则删除
            if(this.root.data.equals(data)){    //根元素为要删除的的元素
                this.root = this.root.next; //第二个元素作为根元素
            }else{  //不是根元素，根元素判断完了
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

    @Override
    public Object[] toArray() {
        if(this.root.data == null){
            return null;
        }
        this.retData = new Object[this.count];
        this.foot = 0;
        this.root.toArrayNode();
        return this.retData;
    }
}
public class TestDemo4 {
    public static void main(String[] args) {
        LinkImpl all = new LinkImpl();
        all.add("火车头");
        all.add("车厢1");
        all.add("车厢2");
        Object[] obj = all.toArray();
        for(int x =0; x<obj.length; x++){
            System.out.println(obj[x]);
        }
    }
}