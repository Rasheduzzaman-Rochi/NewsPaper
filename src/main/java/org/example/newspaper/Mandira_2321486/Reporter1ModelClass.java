package org.example.newspaper.Mandira_2321486;

import java.time.LocalDate;

public class Reporter1ModelClass {
    private String title;
    private String id;
    private LocalDate date;
    private String article;

    public Reporter1ModelClass(String title, String id, LocalDate date, String article) {
        this.title = title;
        this.id = id;
        this.date = date;
        this.article = article;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "Reporter1ModelClass{" +
                "title='" + title + '\'' +
                ", id='" + id + '\'' +
                ", date=" + date +
                ", article='" + article + '\'' +
                '}';
    }
}
