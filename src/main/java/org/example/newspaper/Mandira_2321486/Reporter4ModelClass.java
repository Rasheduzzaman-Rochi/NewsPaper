package org.example.newspaper.Mandira_2321486;

import java.io.Serializable;
import java.time.LocalDate;

public class Reporter4ModelClass implements Serializable {
    private String id;
    private String title;
    private LocalDate date;
    private String article;

    public Reporter4ModelClass(String id, String title, LocalDate date, String article) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.article = article;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        return "Reporter4ModelClass{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", date=" + date +
                ", article='" + article + '\'' +
                '}';
    }
}
