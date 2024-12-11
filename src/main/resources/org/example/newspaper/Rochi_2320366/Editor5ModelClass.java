package org.example.newspaper.Rochi_2320366;

import java.io.Serializable;
import java.time.LocalDate;

public class Editor5ModelClass implements Serializable {
    private String id;
    private String title;
    private String category;
    private LocalDate date;
    private String priority;

    @Override
    public String toString() {
        return "Editor5ModelClass{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", date=" + date +
                ", priority='" + priority + '\'' +
                '}';
    }

    public Editor5ModelClass(String id, String title, String category, LocalDate date, String priority) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.date = date;
        this.priority = priority;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
