package org.example.newspaper.Mandira_2321486;

import java.io.Serializable;
import java.time.LocalDate;

public class DataEntry1ModelClass implements Serializable {
    private String id;
    private String title;
    private LocalDate date;

    public DataEntry1ModelClass(String id, String title, LocalDate date) {
        this.id = id;
        this.title = title;
        this.date = date;
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

    @Override
    public String toString() {
        return "DataEntry1ModelClass{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", date=" + date +
                '}';
    }
}
