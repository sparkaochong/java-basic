package com.ac.day20190228.array;

import java.util.Arrays;

/**
 * @program: java-basic
 * @description: 实现基础二叉树
 * @author: Mr.Ao
 * @create: 2019-02-28 20:51
 **/
class Person1 implements Comparable<Person1> {
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person1 o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class BinaryTree {
    public class Node {
        private Comparable data;
        private Node left;
        private Node right;

        public Node(Comparable data) {
            this.data = data;
        }

        public void addNode(Node newNode) {
            if (this.data.compareTo(newNode.data) > 0) {
                if (this.left == null) {
                    this.left = newNode;
                } else {
                    this.left.addNode(newNode);
                }
            } else {
                if (this.right == null) {
                    this.right = newNode;
                } else {
                    this.right.addNode(newNode);

                }
            }
        }

        public void toArrayNode(){
            if(this.left != null){
                this.left.toArrayNode();
            }
            BinaryTree.this.retData[BinaryTree.this.foot ++] = this.data;
            if(this.right != null){
                this.right.toArrayNode();
            }
        }

    }

    private Node root;
    private int count = 0;
    private int foot = 0;
    private Object[] retData;

    public void add(Object obj) {
        Comparable data = (Comparable) obj;
        Node newNode = new Node(data);
        if (this.root == null) {
            this.root = newNode;
        } else {
            this.root.addNode(newNode);
        }
        this.count ++;
    }

    public Object[] toArray(){
        if(this.count > 0){
            this.foot = 0;
            this.retData = new Object[this.count];
            this.root.toArrayNode();
            return this.retData;
        }else{
            return null;
        }
    }

}
public class TestDemo4 {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(new Person1("张三",15));
        bt.add(new Person1("李四",10));
        bt.add(new Person1("王二",12));
        bt.add(new Person1("麻子",20));
        System.out.println(Arrays.toString(bt.toArray()));
    }
}
