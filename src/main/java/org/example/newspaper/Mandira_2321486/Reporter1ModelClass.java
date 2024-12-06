package org.example.newspaper.Mandira_2321486;

import java.time.LocalDate;

public class Reporter1ModelClass {
    private String title;
    private String id;
    LocalDate date;

    public Reporter1ModelClass(String title, String id, LocalDate date) {
        this.title = title;
        this.id = id;
        this.date = date;
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

    @Override
    public String toString() {
        return "Reporter1ModelClass{" +
                "title='" + title + '\'' +
                ", id='" + id + '\'' +
                ", date=" + date +
                '}';
    }
}
