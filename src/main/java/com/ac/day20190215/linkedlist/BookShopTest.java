package com.ac.day20190215.linkedlist;

import java.util.Objects;

/**
 * Created by aochong Cotter on 2019/2/19.
 * ͼ�����
 */
interface Book{
    public String getTitle(); //�õ��������
    public double getPrice(); //�õ���ļ�Ǯ
}
class BookShop{
    private Link books = new LinkImpl();   //��ʾ���е���
    public void add(Book book){
        this.books.add(book);
    }

    public void remove(Book book){
        this.books.remove(book);
    }

    public Link search(String keyWord){
        Link result = new LinkImpl();
        Object[] obj = this.books.toArray();
        for(int x = 0;x<obj.length; x++){
            Book book = (Book) obj[x];
            if(book.getTitle().contains(keyWord)){
                result.add(book);
            }
        }
        return result;
    }
}
class ComputerBook implements Book{
    private String title;
    private double price;

    public ComputerBook(String title, double price){
        this.title = title;
        this.price = price;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ComputerBook{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null) return false;
        if (!(o instanceof ComputerBook)) return false;
        ComputerBook that = (ComputerBook) o;
        return Double.compare(that.price, price) == 0 &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }
}
class MathBook implements Book{
    private String title;
    private double price;

    public MathBook(String title, double price){
        this.title = title;
        this.price = price;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MathBook{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null) return false;
        if (!(o instanceof MathBook)) return false;
        MathBook that = (MathBook) o;
        return Double.compare(that.price, price) == 0 &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }
}

public class BookShopTest {
    public static void main(String[] args) {
        BookShop shop = new BookShop();
        shop.add(new ComputerBook("Java����", 79.8));
        shop.add(new ComputerBook("Java���ݿ���", 59.8));
        shop.add(new ComputerBook("Java������", 49.8));
        shop.add(new MathBook("��ѧ�е�Java", 29.8));
        shop.add(new MathBook("Java�����Դ���", 39.8));
        shop.add(new MathBook("��ѧ300��", 69.8));
        shop.remove(new ComputerBook("Java���ݿ���", 59.8));
        Link temp = shop.search("Java");
        Object[] obj = temp.toArray();
        for(int x = 0; x<obj.length; x++){
            System.out.println(obj[x]);
        }
    }
}
