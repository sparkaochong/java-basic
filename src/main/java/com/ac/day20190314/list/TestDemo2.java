package com.ac.day20190314.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/**
 * @program: java-basic
 * @description: List的使用
 * @author: Mr.Ao
 * @create: 2019-03-14 10:34
 **/
class Dept{
    private int deptno;
    private String name;
    private String loc;

    public Dept(int deptno, String name, String loc) {
        this.deptno = deptno;
        this.name = name;
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", name='" + name + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Dept dept = (Dept) o;
        return deptno == dept.deptno &&
                Objects.equals(name, dept.name) &&
                Objects.equals(loc, dept.loc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deptno, name, loc);
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        List<Dept> all = new ArrayList<Dept>();
        all.add(new Dept(10,"业务部","北京"));
        all.add(new Dept(20,"技术部","杭州"));
        all.add(new Dept(30,"市场部","上海"));
        all.remove(new Dept(30,"市场部","上海"));
        for(int x=0;x<all.size();x++){
            Dept dept = all.get(x);
            System.out.println(dept);
        }
    }
}
