package com.ac.day20190210.samplejavaclass;

/**
 * Created by Chong Ao on 2019/2/10.
 */
public class TestDemo1 {
    public static void main(String[] args) {
        //第一步：根据结构设计关系
        //1.准备出所有独立的对象，本处属于一对多关系
        Item item = new Item(10, "编程语言", "-");
        SubItem subItemA = new SubItem(1001, "Java编程语言", "-");
        SubItem subItemB = new SubItem(1002, "Python编程语言", "-");
        SubItem subItemC = new SubItem(1003, "C编程语言", "-");
        //2.设置彼此的引用关系
        subItemA.setItem(item);
        subItemB.setItem(item);
        subItemC.setItem(item);
        item.setSubitems(new SubItem[]{subItemA, subItemB, subItemC});
        //第二步：根据表结构取出数据
        System.out.println(subItemA.getInfo());
        System.out.println("\t|- 【分类信息】" + subItemA.getItem().getInfo());
        System.out.println("\n===============================================\n");
        System.out.println(item.getInfo());
        for(int x = 0; x<item.getSubitems().length; x++){
            System.out.println("\t|- " + item.getSubitems()[x].getInfo());
        }
    }
}
