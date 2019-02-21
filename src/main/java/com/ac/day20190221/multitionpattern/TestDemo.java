package com.ac.day20190221.multitionpattern;

/**
 * Created by Chong Ao on 2019/2/21.
 */
class Color{
    private static final Color RED = new Color("ºìÉ«");
    private static final Color GREEN = new Color("ÂÌÉ«");
    private static final Color BLUE = new Color("À¶É«");
    private String title;

    public static Color getInstance(int ch){
        switch(ch){
            case 0: return RED;
            case 1: return GREEN;
            case 2: return BLUE;
            default: return null;
        }
    }

    private Color(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Color{" +
                "title='" + title + '\'' +
                '}';
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Color c = Color.getInstance(0);
        System.out.println(c);
    }
}
