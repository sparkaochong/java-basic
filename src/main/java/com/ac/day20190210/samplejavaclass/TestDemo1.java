package com.ac.day20190210.samplejavaclass;

/**
 * Created by Chong Ao on 2019/2/10.
 */
public class TestDemo1 {
    public static void main(String[] args) {
        //��һ�������ݽṹ��ƹ�ϵ
        //1.׼�������ж����Ķ��󣬱�������һ�Զ��ϵ
        Item item = new Item(10, "�������", "-");
        SubItem subItemA = new SubItem(1001, "Java�������", "-");
        SubItem subItemB = new SubItem(1002, "Python�������", "-");
        SubItem subItemC = new SubItem(1003, "C�������", "-");
        //2.���ñ˴˵����ù�ϵ
        subItemA.setItem(item);
        subItemB.setItem(item);
        subItemC.setItem(item);
        item.setSubitems(new SubItem[]{subItemA, subItemB, subItemC});
        //�ڶ��������ݱ�ṹȡ������
        System.out.println(subItemA.getInfo());
        System.out.println("\t|- ��������Ϣ��" + subItemA.getItem().getInfo());
        System.out.println("\n===============================================\n");
        System.out.println(item.getInfo());
        for(int x = 0; x<item.getSubitems().length; x++){
            System.out.println("\t|- " + item.getSubitems()[x].getInfo());
        }
    }
}
