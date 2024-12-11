package org.example.newspaper.Mandira_2321486;

import java.io.Serializable;
import java.time.LocalDate;

public class DataEntry2ModelClass  {
    private String title;
    private LocalDate date;
    private String category;

    public DataEntry2ModelClass(String title, LocalDate date, String category) {
        this.title = title;
        this.date = date;
        this.category = category;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "DataEntry2ModelClass{" +
                "title='" + title + '\'' +
                ", date=" + date +
                ", category='" + category + '\'' +
                '}';
    }
}
