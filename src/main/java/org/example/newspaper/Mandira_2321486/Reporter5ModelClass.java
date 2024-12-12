package org.example.newspaper.Mandira_2321486;

import java.io.Serializable;
import java.time.LocalDate;

public class Reporter5ModelClass implements Serializable {
    private String title;
    private LocalDate date;
    private String article;
    private String source;

    public Reporter5ModelClass(String title, LocalDate date, String article, String source) {
        this.title = title;
        this.date = date;
        this.article = article;
        this.source = source;
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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Reporter5ModelClass{" +
                "title='" + title + '\'' +
                ", date=" + date +
                ", article='" + article + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
