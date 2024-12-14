package org.example.newspaper.Rochi_2320366;

import java.io.Serializable;
import java.time.LocalDate;

public class ContentManagerModelClass1 implements Serializable {
    private String id;
    private String title;
    private String article;
    private LocalDate date;
    private String category;
    private String status;

    public ContentManagerModelClass1(String id, String title, String article, LocalDate date, String category, String status) {
        this.id = id;
        this.title = title;
        this.article = article;
        this.date = date;
        this.category = category;
        this.status = status;
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

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ContentManagerModelClass1{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", article='" + article + '\'' +
                ", date=" + date +
                ", category='" + category + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
