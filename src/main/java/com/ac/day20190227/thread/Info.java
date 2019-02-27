package com.ac.day20190227.thread;

/**
 * @program: java-basic
 * @description: 数据保存类
 * @author: Mr.Ao
 * @create: 2019-02-27 09:09
 **/
class Info{
    private String title;
    private String content;

    public Info(){}

    public Info(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Info{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
